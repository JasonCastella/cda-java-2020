package initiation;

import outils.Clavier;

public class ConvertNumRomain {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir un nombre compris entre 1 et 3999 : ");
		int n = Clavier.lireInt();
		if (n < 1 || n > 3999) {
			System.out.println("Nous sommes désolé mais la numérotation romaine va de 1 à 3999");
		}
		int m, c, d, u;// m, c, d, u : chiffre des milliers, centaines, dizaines et unités

		m = n / 1000;
		c = (n - m * 1000) / 100;
		d = (n - m * 1000 - c * 100) / 10;
		u = n - m * 1000 - c * 100 - d * 10;

		//System.out.println(m + " " + c + " " + d + " " + u);

		System.out.println((mille(m) + cent(c) + dix(d) + un(u)));
	}

	public static String mille(int m) {
		String xm;
		if (m == 1) {
			xm = "M";
		} else if (m == 2) {
			xm = "MM";
		} else if (m == 3) {
			xm = "MMM";
		} else
			xm = "";
		return xm;
	}

	public static String cent(int c) {
		String xc = "";
		if (c == 1) {
			xc = "C";
		} else if (c == 2) {
			xc = "CC";
		} else if (c == 3) {
			xc = "CCC";
		} else if (c == 4) {
			xc = "CD";
		} else if (c == 5) {
			xc = "D";
		} else if (c == 6) {
			xc = "DC";
		} else if (c == 7) {
			xc = "DCC";
		} else if (c == 8) {
			xc = "DCCC";
		} else if (c == 9) {
			xc = "CM";
		}
		return xc;
	}

	public static String dix(int d) {
		String xd = "";
		if (d == 1) {
			xd = "X";
		} else if (d == 2) {
			xd = "XX";
		} else if (d == 3) {
			xd = "XXX";
		} else if (d == 4) {
			xd = "XL";
		} else if (d == 5) {
			xd = "L";
		} else if (d == 6) {
			xd = "LX";
		} else if (d == 7) {
			xd = "LXX";
		} else if (d == 8) {
			xd = "LXXX";
		} else if (d == 9) {
			xd = "XC";
		}
		return xd;
	}

	public static String un(int u) {
		String xu = "";
		if (u == 1) {
			xu = "I";
		} else if (u == 2) {
			xu = "II";
		} else if (u == 3) {
			xu = "III";
		} else if (u == 4) {
			xu = "IV";
		} else if (u == 5) {
			xu = "V";
		} else if (u == 6) {
			xu = "VI";
		} else if (u == 7) {
			xu = "VII";
		} else if (u == 8) {
			xu = "VIII";
		} else if (u == 9) {
			xu = "IX";
		}
		return xu;
	}
}
