public class Zadatak10 {

	public static void main(String[] args) {

		// Program odredjuje da li je dati broj jedno od rjesenja date kubne
		// jednacine ax^3 + bx^2 + cx + d = 0

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int x = 5;
		if (a * x * x * x + b * x * x + c * x + d == 0) {
			System.out.println("Dati broj je rješenje !");
		} else
			System.out.println("Dati broj nije rješenje !");

	}

}
