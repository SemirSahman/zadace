public class Task3 {

	public static void main(String[] args) {
		
		// This program contains number n and it shows is number n perfect or
		// not.Perfect number is number in which the sum of the divisor
		// (excluding itself) gives us that number

		int n = 28;
		int num = n;
		int counter = 0;
		int sum = 0;

		while (counter < num / 2) {
			counter++;
			if (num % counter == 0) {
				sum += counter;
			}
		}

		if (n == sum) {
			System.out.println("Number: " + n + " is a perfect number.");
		} else {
			System.out.println("Number: " + n + " is NOT a perfect number.");
		}

	}
}