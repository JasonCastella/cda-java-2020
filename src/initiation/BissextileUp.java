package initiation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BissextileUp {

	public static void main(String[] args) {
		giveDate(28, 2, 2000);
		giveDate(29, 2, 2100);
		giveDate(28, 2, 2100);
		giveDate(29, 2, 2000);
	}

	public static void giveDate(int day, int month, int year) {
		if (day > 0 && year > 0) {
			if (february(day, month, year) || tirtyDaysMonth(day, month) || tirtyOneDaysMonth(day, month)) {
				System.out.println(convIntToDate(day, month, year));
			} else
				System.out.println("Vous avez saisie un mois négatif ou supérieur à 12, ou bien l'année n'est pas bissextile");
		} else
			System.out.println("Vous avez saisie un jour et/ou une année négative ou égale à 0");
	}

	public static boolean february(int day, int month, int year) {
		boolean february = false;
		if (month == 2 && day < 29 || day == 29 && leapYear(year)) {
			february = true;
		}
		return february;
	}

	public static boolean tirtyDaysMonth(int day, int month) {
		boolean tirtyDays = false;
		if (month == 4 || month == 6 || month == 9 || month == 11 && day <= 30) {
			tirtyDays = true;
		}
		return tirtyDays;
	}

	public static boolean tirtyOneDaysMonth(int day, int month) {
		boolean tirtyOneDays = false;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
				|| month == 12 && day <= 31) {
			tirtyOneDays = true;
		}
		return tirtyOneDays;
	}

	public static Date convIntToDate(int day, int month, int year) {
		String convIntToString = day + "/" + month + "/" + year;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date convStringToDate = null;
		try {
			convStringToDate = sdf.parse(convIntToString);
		} catch (ParseException e) {
			System.out.println("Un String est attendu");
		}
		return convStringToDate;
	}

	public static boolean leapYear(int year) {
		boolean leapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = true;
		}
		return leapYear;
	}
}