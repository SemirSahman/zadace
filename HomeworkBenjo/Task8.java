import java.util.Scanner;

//This program receives a number n and print all the numbers less than n that are divisible by the sum of its digits

public class Task8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = input.nextInt();
		int digit = 0;
		int sum = 0;

		for (int j = 1; j < num; j++) {
			digit = 0;
			sum = 0;
			for (int i = j; i > 0; i = i / 10) {
				digit = i % 10;
				sum += digit;
			}
			if (j % sum == 0) {
				System.out
						.println("Numbers divisable with sum of input number digits :"
								+ j);
			}
		}
		input.close();
	}
}