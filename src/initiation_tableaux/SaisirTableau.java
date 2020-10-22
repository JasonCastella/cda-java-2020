package initiation_tableaux;

import outils.Clavier;

public class SaisirTableau {

	public static void main(String[] args) {

		int n;
		double moy = 0;
		System.out.print("Combien de valeurs : ");
		n = Clavier.lireInt();

		int[] tab = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Veuillez renseigner la case " + (i + 1) + " du tableau");
			tab[i] = Clavier.lireInt();
		}
		for (int i = 0; i < n; i++) {
			moy += tab[i];
		}
		moy = moy / n;

		int grand = tab[0];
		int petit = grand;

		for (int i = 1; i < n; i++) {
			if (grand < tab[i]) {
				grand = tab[i];
			}
		}

		for (int i = 1; i < n; i++) {
			if (petit > tab[i]) {
				petit = tab[i];
			}
		}

		/*
		 * Sinon IntSummaryStatistics var = Arrays.stream(tab).summaryStatistics();
		 * 
		 * int min = var.getMin(); int max = var.getMax();
		 */

		System.out.println("Moyenne :" + moy + "\nPlus grand :" + grand + "\nPlus petit : " + petit);
	}
}
