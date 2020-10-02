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
		do {
			System.out.println("Veuillez tapper 0-Pierre, 1-Feuille ou 2-Ciseaux :");
			int user = convInt(Clavier.lireString());
			if (user < 3 && user >= 0) {
				int computer = random.nextInt(liste.size());
				System.out.println(
						"Votre signe : " + liste.get(user) + " VS " + liste.get(computer) + " : Signe ordinateur");
				if (user == computer) {
					System.out.println("Même signe, essayez encore !");
				} else if ((computer == 0 && user == 2) || (computer == 2 && user == 1)
						|| (computer == 1 && user == 0)) {
					System.out.println("Vous avez perdu !");
					compScore++;
				} else {
					System.out.println("Vous avez gagné !");
					userScore++;
				}

			} else {
				System.out.println("Vous n'avez pas tappé Pierre, Feuille ou Ciseaux...");
			}
		} while (playAgain());
		System.out.println("Score final : Vous : " + userScore + " Ordinateur : " + compScore);
	}

	public static boolean playAgain() {
		int x = 2;
		boolean playAgain = false;

		do {
			System.out.println("Tappez 1 pour rejouer, sinon tappez 2");
			x = Clavier.lireInt();
			if (x == 1 || x == 2) {
				if (x == 1) {
					playAgain = true;
				}
			}
		} while (x != 1 && x != 2);
		return playAgain;
	}

	public static int convInt(String saisie) {
		int x;
		try {
			x = Integer.parseInt(saisie);
		} catch (Exception e) {
			x = -1;
		}
		return x;
	}

}
