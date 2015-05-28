public class Task4 {

	public static void main(String[] args) {

		// Our input.in file in first line contains m and n. Number n shows how
		// much numbers will come after n and m, while m is required number.
		// This program prints if the required number m is in the n numbers.

		TextIO.readFile("src/input.in");

		int n;
		int m;
		n = TextIO.getlnInt();
		m = TextIO.getlnInt();
		int num = 0;
		int counter = 0;
		boolean numFound = false;

		if (n != 0) {
			num = TextIO.getlnInt();
		}

		while (counter < n) {
			counter++;
			if (num == m) {
				numFound = true;
				break;
			}

		}
		if (n != 0 && numFound == true) {
			System.out.println("Number " + m + " exist in file.");
		} else {
			System.out.println("Number " + m + " does not exist in file.");
		}

	}

}
