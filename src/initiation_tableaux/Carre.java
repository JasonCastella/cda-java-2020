package initiation_tableaux;

import outils.Clavier;

public class Carre {
	public static void main(String[] args) {

		int n;
		System.out.print("Combien de valeurs : ");
		n = Clavier.lireInt();
		int[] carre = new int[n];
		for (int i = 0; i < n; i++) {
			carre[i] = ((2 * i + 1) * (2 * i + 1));
			System.out.println((2 * i + 1) + " a pour carre " + carre[i]);

		}
	}
}
