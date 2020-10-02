package initiation;

import java.util.List;
import java.util.Random;
import outils.Clavier;
import java.util.ArrayList;

public class PierreFeuilleCiseaux {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();
		liste.add("Pierre");
		liste.add("Feuille");
		liste.add("Ciseaux");
		// System.out.println(liste.get(0) + liste.get(1) + liste.get(2));

		Random random = new Random();
		int userScore = 0;
		int compScore = 0;
		System.out.println("Bienvenue sur notre jeu Pierre, Feuille, Ciseaux !\n");
		System.out.println("Tappez le chiffre correspondant à votre signe.\n");
		do {
			System.out.println("0:Pierre\t1:Feuille\t2:Ciseaux");
			int user = testInt(Clavier.lireString());
			if (user < 3 && user >= 0) {
				int computer = random.nextInt(liste.size());
				System.out.println(
						"Vous avez choisi : " + liste.get(user) + "\nOrdinateur a choisi : " + liste.get(computer));
				if (user == computer) {
					System.out.println("Egalité !");
				} else if ((computer == 0 && user == 2) || (computer == 2 && user == 1)
						|| (computer == 1 && user == 0)) {
					System.out.println("Vous avez perdu, + 1 point pour l'ordinateur !");
					compScore++;
				} else {
					System.out.println("Vous avez gagné, + 1 point pour vous !");
					userScore++;
				}

			} else {
				System.out.println("Vous devez tapper 0 1 ou 2, pour Pierre Feuille ou Ciseaux respectiement");
			}
		} while (playAgain());
		System.out.println("Score final : Vous " + userScore + " - " + compScore + " Ordinateur.");
	}

	/**
	 * Test si l'utilisateur veut continuer
	 * 
	 * @return true si il veut jouer, false si il veut arreter
	 */
	public static boolean playAgain() {
		String test = "";
		boolean playAgain = false;
		System.out.println("Pour rejouer tappez 0, sinon tappez autre chose");
		test = Clavier.lireString();
		if (test.equals("0")) {
			playAgain = true;
		}
		return playAgain;
	}

	/**
	 * Vérifie si l'utilisateur a rentré un entier
	 * 
	 * @param saisie valeur saisie par l'utilisateur
	 * @return le nombre entier correspondant, sinon -1 pour retourner un entier qui
	 *         ne va pas rentrer dans la boucle par la suite
	 */
	public static int testInt(String saisie) {
		int x;
		try {
			x = Integer.parseInt(saisie);
		} catch (Exception e) {
			x = -1;
		}
		return x;
	}

}
