public class Task2 {

	// Our file contains an indeterminate number of numbers. Last number -1 in
	// the file signifies the end. Program prints the sum counted
	// in file on the console

	public static void main(String[] args) {

		TextIO.readFile("src/input.in");
		int sum = 0;
		int num = 0;

		while (num != -1) {
			sum += num;
			num = TextIO.getlnInt();
		}

		System.out.println("Sum is: " + sum);

	}

}
