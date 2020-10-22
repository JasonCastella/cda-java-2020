package initiation_tableaux;

import java.util.Arrays;
import outils.Clavier;

public class Palindromes {

	public static void main(String[] args) {

		int n = 0;
		System.out.println("Combien de lettres possède votre soit disant palindrome ?");
		n = Clavier.lireInt();
		String[] tab = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Veuillez renseigner la " + (i + 1) + " lettre.");
			tab[i] = Clavier.lireString();
		}
		System.out.println(Arrays.toString(tab));

		int d = n - 1;
		String[] test = new String[n];
		for (int i = 0; i < n; i++) {
			test[i] = tab[d];
			d--;
		}
		System.out.println(Arrays.toString(test));

		if (Arrays.equals(tab, test)) {
			System.out.println("C'est effectivement un Palindrome");
		} else {
			System.out.println("Je suis désolé, ce n'est pas un Palindrome");
		}
	}
}
