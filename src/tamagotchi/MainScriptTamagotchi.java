package tamagotchi;

import outils.Clavier;

public class MainScriptTamagotchi {

	public static void main(String[] args) {

		String specie;
		String name;
		String color;
		String tall = "";
		int health = 0;
		int lifeExpectancy = 0;

		System.out.println("Bienvenue sur notre jeu Tamagotchi !");

		do {
			System.out.println(
					"Veuillez choisir et �crire une esp�ce parmis les suivantes : Chien, Chat, Ecureuil, Lapin, Dragon");
			specie = Clavier.lireString();
		} while (!specie.equals("Chien") && !specie.equals("Chat") && !specie.equals("Ecureuil")
				&& !specie.equals("Lapin") && !specie.equals("Dragon"));

		System.out.println("Quel nom voulez vous lui donner ?");
		name = Clavier.lireString();

		do {
			System.out.println("Veuillez choisir une couleur parmis les suivantes : noir, blanc, gris, marron, roux ?");
			color = Clavier.lireString();
		} while (!color.equals("noir") && !color.equals("blanc") && !color.equals("gris") && !color.equals("marron")
				&& !color.equals("roux"));

		Tamagotchi yourTam = new Tamagotchi(name, specie, color, tall, health, lifeExpectancy);
		System.out.println("F�licitation, vous venez de cr�er votre Tamagotchi !\n");
		yourTam.chosenSpecie(specie);
		yourTam.show();

		System.out.println(
				"\nChaque journ�e se d�roule en 10 actions, et certaines sont primordiale pour le bien �tre de votre Tamagotchi.");
		System.out.println(
				"Il aura des envies et des besoins et si vous ne les respectez pas, il perdra des points de vie. Si jamais sa vie atteint 0, la partie s'arr�te.");
		System.out.println(
				"En revanche, si vous prenez soin de lui, il atteindra son esp�rance de vie maximale. Tachez donc de bien vous occuper de lui !");

		for (int x = 1; x <= yourTam.getLife(); x++) {
			System.out.println("Jour " + x);
			yourTam.showHealth();
			/*for (int i = 1; i < 11; i++) {
				System.out.println("Action num�ro : " + i+"\nTappez une action � effectuer :");
				yourTam.showActions();
				

				
				
				
				
				
				
				
			}*/
		}

	}
}
