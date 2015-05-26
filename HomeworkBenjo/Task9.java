public class Task9 {

	// This program draws an equilateral triangle on the console using "*"

	public static void main(String[] args) {
		int stranica = 5;
		for (int i = 1; i <= stranica; i++) {
			for (int j = 1; j <= stranica; j++) {
				if ((i + j) > stranica) {
					System.out.print("*");
					System.out.print(" ");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}