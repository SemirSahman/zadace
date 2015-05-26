import java.util.Scanner;

//This program receives two parameters, the first parameter is number and the second parameter is number of the digits. The program prints the nth digit from the right side of number

public class Task6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input number : ");
		int num = input.nextInt();
		System.out.print("Input element : ");
		int element = input.nextInt();
		int element2 = 0;
		boolean element3 = false;

		for (int i = num; i > 0; i = i / 10) {
			element2++;
			if (element == element2) {
				System.out.println(element + ". element is " + i % 10);
				element3 = true;
				break;
			}
		}
		if (!element3) {
			System.out
					.println("Number does not have " + element + ". element.");
		}

		input.close();
	}
}