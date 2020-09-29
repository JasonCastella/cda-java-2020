package initiation;

public class ConvertNumRomainUp {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir un nombre compris entre 1 et 3999 :");
		int nb = Clavier.lireInt();
		if (nb < 1 || nb > 3999) {
			System.out.println("La numérotation romaine est comprise entre 1 et 3999, désolé");
		}
		int m, c, d, u;// m, c, d, u : milliers, centaines, dizaines et unités
		m = nb / 1000;
		c = (nb - m * 1000) / 100;
		d = (nb - m * 1000 - c * 100) / 10;
		u = nb - m * 1000 - c * 100 - d * 10;
		String resultat = "";
		if (m > 0) {
			for (int i = 0; i < m; i++) {
				resultat += "M";
			}
		}
		if (c > 0) {
			resultat += convert(c, "C", "D", "M");
		}
		if (d > 0) {
			resultat += convert(d, "X", "L", "C");
		}
		if (u > 0) {
			resultat += convert(u, "I", "V", "X");
		}
		System.out.println(resultat);
	}

	/**
	 * converti le chiffre de chaque puissance de 10 du nombre en chiffre romain
	 * 
	 * @param x  la puissance de 10 à convertir
	 * @param S1 symbole de la puissance de 10 en question
	 * @param S2 symbole du cinq de la puissance de 10 en question
	 * @param S3 symbole du la puissance de 10 suivante
	 * @return La conversion de la puissance de 10
	 */
	public static String convert(int x, String S1, String S2, String S3) {
		String test = "";
		if (x == 1) {
			test = S1;
		} else if (x == 2) {
			test = S1 + S1;
		} else if (x == 3) {
			test = S1 + S1 + S1;
		} else if (x == 4) {
			test = S1 + S2;
		} else if (x == 5) {
			test = S2;
		} else if (x == 6) {
			test = S2 + S1;
		} else if (x == 7) {
			test = S2 + S1 + S1;
		} else if (x == 8) {
			test = S2 + S1 + S1 + S1;
		} else if (x == 9) {
			test = S1 + S3;
		}
		return test;
	}
}