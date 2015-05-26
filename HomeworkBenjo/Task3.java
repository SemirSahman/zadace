import java.util.Scanner;

//This program asks the user to enter a number, and then prints the sum of numbers digits

public class Task3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = input.nextInt();
		int digit = 0;
		int sum = 0;

		for (int i = num; i > 0; i /= 10) {
			digit = i % 10;
			sum += digit;
		}
		System.out.println("Sum of digits is " + sum);

		input.close();
	}
}