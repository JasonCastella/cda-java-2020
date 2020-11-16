package initiation_tableaux;

import java.util.Arrays;

public class Ascii {

	public static void main(String[] args) {

		char[] orderChar = { 'g', 'r', 'e', 't', 'a' };
		maxiChar(orderChar);
		minChar(orderChar);
		trieChar(orderChar);

	}

	public static char maxiChar(char[] tab) {
		char result = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > result) {
				result = tab[i];
			}
		}
		System.out.println(result);
		return result;
	}

	public static char minChar(char[] tab) {
		char result = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < result) {
				result = tab[i];
			}
		}
		System.out.println(result);
		return result;
	}

	public static void trieChar(char[] tab) {
		char charInter;
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[i] > tab[j]) {
					charInter = tab[i];
					tab[i] = tab[j];
					tab[j] = charInter;
				}
			}
		}
		System.out.println(Arrays.toString((tab)));
	}

}
