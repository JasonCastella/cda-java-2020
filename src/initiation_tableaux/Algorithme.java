package initiation_tableaux;

import outils.Clavier;

public class Algorithme {

	public static void main(String[] args) {

		int som = 0;
		int[] tab = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Veuillez renseigner la case " + (i + 1) + " du tableau");
			tab[i] = Clavier.lireInt();
			som += tab[i];
		}
		System.out.println("La somme des valeurs saisie est " + som);
	}
}
