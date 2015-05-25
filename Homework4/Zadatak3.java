public class Zadatak3 {

	public static void main(String[] args) {

		// Program sadrzi 6 varijabli koje predstavljaju dva datuma i ispisuje
		// na konzolu koji datum od ta dva dodje prije drugoga.

		int day1 = 15;
		int month1 = 7;
		int year1 = 2014;
		int day2 = 14;
		int month2 = 7;
		int year2 = 2014;

		if (year1 < year2) {
			System.out.println(day1 + "." + month1 + "." + year1);
		} else if (year2 < year1) {
			System.out.println(day2 + "." + month2 + "." + year2);
		} else if (month1 < month2) {
			System.out.println(day1 + "." + month1 + "." + year1);
		} else if (month2 < month1) {
			System.out.println(day2 + "." + month2 + "." + year2);
		} else if (day1 < day2) {
			System.out.println(day1 + "." + month1 + "." + year1);
		} else if (day2 < day1) {
			System.out.println(day2 + "." + month2 + "." + year2);
		}

	}

}
