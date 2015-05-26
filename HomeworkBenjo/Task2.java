import java.util.Scanner;

// This program prints the nth element of fibonachi series

public class Task2 {

	public static void main(String[] args) {
		int num1 = 0, counter = 1, sum = 1, num2 = 1;
		int num = 0;
		Scanner in = new Scanner(System.in);
		while (num <= 1 || num >= 50) {
			System.out.println("Input number");
			num = in.nextInt();
		}
		while (counter < num) {

			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			counter++;
		}
		System.out.println(sum);
		in.close();
	}

}