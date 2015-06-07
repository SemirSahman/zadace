import java.util.Scanner;

public class Loops {

	public static void numComa(int Num) {

		String var = "";
		String var1 = "";
		int counter = 0;
		var = var + Num;
		char tmp = var.charAt(0);

		int length = var.length();
		for (int i = length - 1; i > 0; i--) {
			char c = var.charAt(i);
			counter++;
			if (counter % 3 != 0)
				var1 = c + var1;
			else
				var1 = "." + c + var1;
		}

		var1 = tmp + var1;
		System.out.printf(var1 + " ");
	}

	public static int numDigits(int Num) {

		int counter = 0;
		while (Num > 0) {
			Num /= 10;
			counter++;
		}

		return counter;
	}

	public static int replaceNum(int Num) {
		if (Num < 10) {
			return Num;
		} else {

			String line = "";
			String line1 = "";
			line = line + Num;
			int length = line.length();
			char first = line.charAt(0);
			char last = line.charAt(length - 1);
			for (int i = 1; i < length - 1; i++) {
				char c = line.charAt(i);
				line1 = line1 + c;
			}

			line1 = last + line1 + first;

			int result = Integer.parseInt(line1);

			return result;
		}
	}

	public static int numBetween(int Num, int Num1) {
		int counter = 0;
		for (int i = Num + 1; i < Num1; i++) {
			counter++;
		}
		return counter;
	}

	public static void oddOrEven(int Num, int Num1, int Num2) {

		if (Num % 2 == 0) {
			for (int i = Num1; i < Num2; i++) {
				if (i % 2 == 0) {
					numComa(i);
				}
			}
		} else {
			for (int i = Num1; i < Num2; i++) {
				if (i % 2 != 0) {
					numComa(i);

				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int Num = input.nextInt();

		System.out.print("Number with coma after every three digits: ");
		numComa(Num);
		System.out.println();

		System.out.println("Number of digits: " + numDigits(Num));

		int Num1 = replaceNum(Num);
		System.out.print("Number with replaced first and last number: ");
		numComa(Num1);
		System.out.println();

		int range = numBetween(Num, Num1);
		System.out.println(range + " numbers there are between " + Num
				+ " and " + Num1);

		System.out
				.println("All odd/even numbers : ");
		oddOrEven(range, Num, Num1);

	}
}