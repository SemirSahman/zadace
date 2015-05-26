import java.util.Scanner;

//This program calculates and prints the sum of all the divisors of n

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = -1;
		int sum = 0;
		while (num != 0) {
			sum = 0;
			System.out.println("Input number");
			num = in.nextInt();
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					sum += i;
			}
			if (sum != 0)
				System.out.println("Sum of all divisors is: "
						+ sum);
		}
		System.out.println("End of program");
		in.close();
	}

}