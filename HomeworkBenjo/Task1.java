import java.util.Scanner;
//This program prints a rectangle whereby are given pages a and b

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input two numbers");
		int num = in.nextInt();
		int num2 = in.nextInt();
		String a = "|";
		String b = "-";
		for (int i = 1; i <= num; i++) {
			if (i == 1 || i == num) {
				System.out.print("+");
				for (int j = 1; j <= num2 - 2; j++) {
					System.out.print(b);
				}
				System.out.print("+");
			} else if (i > 1 && i < num) {
				for (int j = 1; j <= num2; j++) {
					if (j == 1 || j == num2)
						System.out.print(a);
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		in.close();
	}

}