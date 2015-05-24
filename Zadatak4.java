public class Zadatak4 {

	public static void main(String[] args) {

		// Program odredjuje horoskopski znak za uneseni datum koji je definisan
		// u varijablama

		int day = 1;
		int month = 11;

		if ((day >= 21 && day <= 31 && month == 3)
				|| (day >= 1 && day <= 20 && month == 4)) {
			System.out.println("Ovan !");
		} else if ((day >= 21 && day <= 30 && month == 4)
				|| (day >= 1 && day <= 21 && month == 5)) {
			System.out.println("Bik !");
		} else if ((day >= 21 && day <= 31 && month == 5)
				|| (day >= 1 && day <= 21 && month == 6)) {
			System.out.println("Blizanci !");
		} else if ((day >= 22 && day <= 30 && month == 6)
				|| (day >= 1 && day <= 22 && month == 7)) {
			System.out.println("Rak !");
		} else if ((day >= 23 && day <= 31 && month == 7)
				|| (day >= 1 && day <= 23 && month == 8)) {
			System.out.println("Lav !");
		} else if ((day >= 24 && day <= 31 && month == 8)
				|| (day >= 1 && day <= 23 && month == 9)) {
			System.out.println("Djevica !");
		} else if ((day >= 24 && day <= 30 && month == 9)
				|| (day >= 0 && day <= 23 && month == 10)) {
			System.out.println("Vaga !");
		} else if ((day >= 24 && day <= 31 && month == 10)
				|| (day >= 1 && day <= 22 && month == 11)) {
			System.out.println("Skorpija !");
		} else if ((day >= 23 && day <= 30 && month == 11)
				|| (day >= 1 && day <= 21 && month == 12)) {
			System.out.println("Strijelac !");
		} else if ((day >= 22 && day <= 31 && month == 12)
				|| (day >= 1 && day <= 20 && month == 1)) {
			System.out.println("Jarac !");
		} else if ((day >= 21 && day <= 31 && month == 1)
				|| (day >= 1 && day <= 19 && month == 2)) {
			System.out.println("Vodolija !");
		} else if ((day >= 20 && day <= 29 && month == 2)
				|| (day >= 1 && day <= 20 && month == 3)) {
			System.out.println("Riba !");
		}

	}

}
