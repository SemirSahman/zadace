import java.util.Scanner;

//This program gives us lowest common divisor for 2 numbers that we input in console

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite dva broja");
		int a = in.nextInt();
		int b = in.nextInt();
		int lcd = 0;
		int num = 0;
		if (a < b)
			num = a;
		else
			num = b;
		for (int i = 1; i <= num; i++) {
			if (a % i == 0 && b % i == 0)
				lcd = i;
		}
		System.out.println("Lowest common divisor is " + lcd);
		in.close();
	}

}