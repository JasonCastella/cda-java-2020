package initiation_tableaux;

import java.util.Arrays;

import outils.Clavier;

public class SaisirAfficherTableau {

	public static void main(String[] args) {

		int x;
		int[] tab = new int[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Veuillez saisir un entier");
			x = Clavier.lireInt();
			if (x != 0) {
				tab[i] = x;
			} else
				break;
		}
		System.out.println(Arrays.toString(tab));

	}

}
