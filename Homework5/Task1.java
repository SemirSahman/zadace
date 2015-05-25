public class Task1 {

	public static void main(String[] args) {

		// This program shows how many times can number which is defined in var
		// n be divided

		int n = 16;
		int num = n;
		int counter = 0;

		while (num / 2 > 0) {
			num /= 2;
			counter++;
		}
		System.out.println("Number " + n + " can be divided " + counter
				+ " times");

	}

}
