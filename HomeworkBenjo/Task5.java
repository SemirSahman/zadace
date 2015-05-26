import java.util.Scanner;

//This program loads the number from user and then prints the number without zeros appearing in a number

public class Task5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = input.nextInt();
		int digit = 0;
		int num2 = 0;

		for (int i = 0; i < num; i = i * 10) {
			digit = num % 10;
			if (digit != 0) {
				num2 = num2 * 10 + digit;
			}
			num /= 10;
		}

		digit = 0;
		num = num2;
		num2 = 0;
		for (int i = num; i > 0; i = i / 10) {
			digit = i % 10;
			num2 = num2 * 10 + digit;
		}

		System.out.println("Number without zeros: " + num2);

		input.close();
	}
}