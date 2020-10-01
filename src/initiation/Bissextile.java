package initiation;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bissextile {

	public static void main(String[] args) {

		// aujourdhui();
		// maintenant();
		renvoieDate(14, 2, -1);

	}

	/**
	 * Donne la date du jour au format dd/MM/yyyy
	 */
	public static void aujourdhui() {
		Date date = new Date();
		// System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
	}

	/**
	 * Donne l'heure actuelle au format --H--m--s
	 */
	public static void maintenant() {
		Date date = new Date();
		// System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("H'H'm'm's's'");
		System.out.println(sdf.format(date));
	}

	/**
	 * Retourne si une année est bissextile ou non
	 * 
	 * @param year
	 * @return boolean
	 */
	public static boolean estBissextile(int year) {
		boolean x = false;
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				x = true;
			} else if (year % 400 == 0) {
				x = true;
			} else
				x = false;
		}
		return x;
	}

	/**
	 * Nous convertie des int au format date
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @throws ParseException
	 */
	public static Date convDate(int day, int month, int year) {
		String convString = day + "/" + month + "/" + year;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date result = null;
		try {
			result = sdf.parse(convString);
		} catch (ParseException e) {
			System.out.println("La dates n'est pas au bon format");
		}
		return result;
	}

	/**
	 * Permet de tester et d'afficher une date en format date
	 */
	public static void renvoieDate(int day, int month, int year) {
		if (month > 0 && month <= 12 && day > 0 && day <= 31) {
			if (month == 2) {
				if (day > 29) {
					System.out.println("Il n'y à qu'au maximum 29 jours au mois de Février x)");
				} else if ((day <= 28) || (day == 29 && estBissextile(year))) {
					System.out.println(convDate(day, month, year));
				} else {
					System.out.println("L'année " + year + " n'est pas une année bissextile");
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				System.out.println(convDate(day, month, year));
			} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
				System.out.println(convDate(day, month, year));
			}
		} else {
			System.out.println("La date saisie ne correspond pas à une date valide de notre calendrier");
		}
	}
}