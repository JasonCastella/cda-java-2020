package tamagotchiV2;

public class Main {

	public static void main(String[] args) {

		// local
		String specie;
		String color;
		String name;
		int age = 0;
		Tamagotchiv2 tam;

		System.out.println("Bienvenue sur notre jeu Tamagotchi !\n");

		do {
			System.out.println("Veuillez choisir et �crire une esp�ce parmis les suivantes : chien, chat, dragon");
			specie = Clavier.lireString();
			specie = specie.toLowerCase();
		} while (!specie.equals("chien") && !specie.equals("chat") && !specie.equals("dragon"));

		System.out.println("Quel nom voulez vous lui donner ?");
		name = Clavier.lireString();
		do {
			System.out.println("Veuillez choisir une couleur parmis les suivantes : noir, blanc, gris, marron, roux ?");
			color = Clavier.lireString();
			color = color.toLowerCase();
		} while (!color.equals("noir") && !color.equals("blanc") && !color.equals("gris") && !color.equals("marron")
				&& !color.equals("roux"));
		tam=new Dog(name, specie, color);
		switch (specie) {
		case "chien":
			tam = new Dog(name, specie, color);
			break;
		case "chat":
			tam = new Cat(name, specie, color);
			break;
		case "dragon":
			tam = new Dragon(name, specie, color);
			break;
		}

		System.out.println("F�licitation, vous venez de cr�er votre Tamagotchi !\n");
		tam.showTam();

		System.out.println(
				"\nChaque journ�e se d�roule en 10 actions, et certaines sont primordiale pour le bien �tre de votre Tamagotchi.");
		System.out.println(
				"Il aura des envies et des besoins et si vous ne les respectez pas, il perdra des points de vie. Si jamais sa vie atteint 0, la partie s'arr�te.");
		System.out.println(
				"En revanche, si vous prenez soin de lui, il atteindra son esp�rance de vie maximale. Tachez donc de bien vous occuper de lui !");

		for (age = 1; age <= tam.getLife(); age++) {
			System.out.println("\nJour num�ro " + age);
			for (int i = 1; i < 11; i++) {
				int action;
				do {
					System.out.println("Action " + i + "\nChoisir une action");
					tam.showHealth();
					tam.showActions();
					action = Clavier.lireIntOrZero();
					tam.pickAction(action);
					if (action == 7) {
						Tamagotchiv2 babyTam;
						babyTam=new Dog(name, specie, color);
						switch (specie) {
						case "chien":
							babyTam = new Dog(name + " Junior", specie, color);
							break;
						case "chat":
							babyTam = new Cat(name + " Junior", specie, color);
							break;
						case "dragon":
							babyTam = new Dragon(name + " Junior", specie, color);
							break;
						}
						babyTam.showBaby();
					}
				} while (action < 1 || action > 11);
				tam.addNeeds();
				tam.needs();
			}
			tam.addHealth();
		}
		tam.naturalDeath();
	}
}
