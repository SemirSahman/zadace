public class Task2 {

	public static void main(String[] args) {

		// This program finds sum of all even numbers from 1 to n, but not
		// including n

		int n = 20;
		int num = n;
		int counter = 0;
		int sum = 0;

		while (counter < num) {
			counter += 2;
			if (counter < num) {
				sum += counter;
			}
		}

		if (n % 2 == 0) {
			System.out.println("Sum of all even numbers from 0 to " + n
					+ " is " + sum + ", not including " + n + ".");
		} else {
			System.out.println("Sum of all even numbers from 0 to " + n
					+ " is " + sum + ".");
		}

	}

}
