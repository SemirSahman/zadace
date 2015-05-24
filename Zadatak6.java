public class Zadatak6 {

	public static void main(String[] args) {

		// Program sadrzi 2 varijable koje predtsavljaju vrijeme u formatu
		// 24:00h, a na konzoli ih ispisuje u formatu AM/PM .

		int hours = 10;
		int minutes = 34;

		if (hours > 12) {
			System.out.println((hours - 12) + ":" + minutes + " PM");
		} else {
			System.out.println(hours + ":" + minutes + " AM");
		}

	}

}
