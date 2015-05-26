import java.util.Scanner;

//This program receives a number n and print all the numbers less than n which are magic

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number");
		int num = in.nextInt();
		for (int j = 1; j < num; j++) {
			int sum = 0;
			for (int i = 1; i < j; i++) {
				if (j % i == 0)
					sum += i;
			}
			if (sum == j)
				System.out.println("Magic number : " + sum);
		}

		in.close();
	}

}