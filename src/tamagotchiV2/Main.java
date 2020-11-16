package tamagotchiV2;

public class Main {

	public static void main(String[] args) {

		// local
		String specie;
		String color;
		String name;
		int age = 0;
		Tamagotchiv2 tam = new Tamagotchiv2();

		System.out.println("Bienvenue sur notre jeu Tamagotchi !\n");

		do {
			System.out.println("Veuillez choisir et écrire une espèce parmis les suivantes : chien, chat, dragon");
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
		switch (specie) {
		case "chien":
			Dog dog = new Dog(name, specie, color);
			tam = dog;
			break;
		case "chat":
			Cat cat = new Cat(name, specie, color);
			tam = cat;
			break;
		case "dragon":
			Dragon drake = new Dragon(name, specie, color);
			tam = drake;
			break;
		}

		System.out.println("Félicitation, vous venez de créer votre Tamagotchi !\n");
		tam.showTam();

		System.out.println(
				"\nChaque journée se déroule en 10 actions, et certaines sont primordiale pour le bien être de votre Tamagotchi.");
		System.out.println(
				"Il aura des envies et des besoins et si vous ne les respectez pas, il perdra des points de vie. Si jamais sa vie atteint 0, la partie s'arrête.");
		System.out.println(
				"En revanche, si vous prenez soin de lui, il atteindra son espérance de vie maximale. Tachez donc de bien vous occuper de lui !");

		for (age = 1; age <= tam.getLife(); age++) {
			System.out.println("\nJour numéro " + age);
			for (int i = 1; i < 11; i++) {
				int action;
				do {
					System.out.println("Action " + i + "\nChoisir une action");
					tam.showHealth();
					tam.showActions();
					action = Clavier.lireIntOrZero();
					tam.pickAction(action);
					if (action == 7) {
						Tamagotchiv2 babyTam = new Tamagotchiv2(name + " Junior", specie, color);
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
