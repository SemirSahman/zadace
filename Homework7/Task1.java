public class Task1 {

	// This program reads reads two numbers n and m from file input.in and
	// prints all numbers betwen them

	public static void main(String[] args) {

		TextIO.readFile("src/input.in");

		int num1;
		int num2;

		num1 = TextIO.getlnInt();
		num2 = TextIO.getlnInt();

		System.out.println("Numbers betwen " + num1 + " and " + num2 + " are:");
		for (int i = num1 + 1; i < num2; i++) {
			System.out.print(i + ", ");
		}

	}

}
