import java.util.Scanner;

public class Strings {

	public static void combineStrings(String line1, String line2) {

		String line = "";
		int num1 = line1.length();
		int num2 = line2.length();

		if (num2 < num1) {

			for (int i = 0; i < line2.length(); i++) {
				char first = line1.charAt(i);
				char second = line2.charAt(i);
				line = line + first + second;
			}
			String line3 = "";
			for (int i = num1 - 1; i > num2 - 1; i--) {
				char first = line1.charAt(i);
				line3 = first + line3;
			}
			line = line + line3;
			System.out.println(line);

		} else {
			for (int i = 0; i < line1.length(); i++) {
				char first = line1.charAt(i);
				char second = line2.charAt(i);
				line = line + first + second;
			}
			String line3 = "";
			for (int i = num2 - 1; i > num1 - 1; i--) {
				char second = line2.charAt(i);
				line3 = second + line3;
			}
			line = line + line3;
			System.out.println(line);
		}

	}

	public static boolean allCharsExists(String line1, String line2) {

		int counter = 0;
		for (int i = 0; i < line1.length(); i++) {
			for (int j = 0; j < line2.length(); j++) {
				char first = line1.charAt(i);
				char second = line2.charAt(j);
				if (first == second) {
					counter++;
					break;
				}
			}
		}
		if (counter == line1.length()) {
			return true;
		} else
			return false;
	}

	public static String seconOrder(String line1, String line2) {

		int result = line1.compareTo(line2);

		if (result < 0) {
			return line2;
		} else {
			return line1;
		}
	}

	public static boolean anagramOfString(String Line1, String Line2) {

		if (Line1.length() != Line2.length())
			return false;
		for (int i = 0; i < Line1.length(); i++) {
			int value = Line2.indexOf(Line1.charAt(i));
			if (value == -1) {
				return false;
			} else {
				Line2 = Line2.substring(0, value) + Line2.substring(value + 1);

			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String line1 = input.nextLine();
		System.out.println("Enter second String: ");
		String line2 = input.nextLine();

		System.out.print("Two string combined: ");
		combineStrings(line1, line2);

		System.out
				.println("All the characters are in the second string: ");
		System.out.println(allCharsExists(line1, line2));

		System.out.print(seconOrder(line1, line2));
		System.out
				.println(" comes later compared to the second string in alphabetical order");
		
		System.out
				.print("Strings are anagrams: ");
		System.out.println(anagramOfString(line1, line2));
	}

}