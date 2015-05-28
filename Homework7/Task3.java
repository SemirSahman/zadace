public class Task3 {

	public static void main(String[] args) {

		TextIO.readFile("src/input.in");

		int numNumber = TextIO.getlnInt();

		// Our input file has n+1 numbers. First number is n. n shows how much
		// number will come behind n. This program prints lowest number in file
		// .

		int num;
		int minNum;

		if (numNumber != 0) {
			num = TextIO.getlnInt();
			minNum = num;
		} else {
			minNum = 0;
		}

		for (int i = 0; i < numNumber - 1; i++) {
			num = TextIO.getlnInt();
			if (num < minNum) {
				minNum = num;
			}
		}

		if (numNumber != 0) {
			System.out.println("Lowest number is: " + minNum);
		} else {
			System.out.println("File is empty.");
		}

	}
}