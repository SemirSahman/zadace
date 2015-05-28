public class Task5 {

	// We have 2 files, one file is decimal.in and other is binary.out. this
	// program loads number from decimal.in and converts it to to binary number
	// and puts it in binary.out file

	public static void main(String[] args) {

		TextIO.readFile("src/decimal.in");

		int num = TextIO.getInt();
		int counter = 0;
		String binaryNum = "";
		int extra = 0;

		TextIO.writeFile("src/binary.out");

		while (num != 0) {
			if (num % 2 == 0) {
				TextIO.put(0 + "\n");
			} else {
				TextIO.put(1 + "\n");
			}
			counter++;
			num /= 2;
		}

		TextIO.readFile("src/binary.out");

		for (int i = 0; i < counter; i++) {
			extra = TextIO.getlnInt();
			binaryNum = extra + binaryNum;
		}

		TextIO.writeFile("src/binary.out");
		TextIO.put(binaryNum);

	}
}