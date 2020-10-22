package initiation_tableaux;

import outils.Clavier;

public class LesNotes {

	public static void main(String[] args) {

		int n, nb = 0;
		double moy = 0;
		System.out.print("Combien de valeurs : ");
		n = Clavier.lireInt();

		int[] tab = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Veuillez renseigner la case " + (i + 1) + " du tableau");
			tab[i] = Clavier.lireInt();
			moy += tab[i];
		}
		moy = moy / n;

		for (int i = 0; i < n; i++) {
			if (tab[i] > moy) {
				nb++;
			}
		}
		System.out.println("Il y a " + nb + " au dessus de la moyenne " + moy);

	}
}