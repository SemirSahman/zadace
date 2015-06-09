public class Arguments {

	/**
	 * Returns array of doubles represented in String values.
	 * 
	 * @param s
	 *            Array of Stings.
	 * @return Array of doubles.
	 * @throws ArrayIndexOutOfBoundsException
	 *             When String does not match regular float expression.
	 */
	public static double[] readArguments(String[] s)
			throws ArrayIndexOutOfBoundsException {
		if (s.length == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		double[] array = new double[s.length];
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = Double.parseDouble(s[i]);
			} catch (NumberFormatException e) {
				System.out.println("Wrong argument.");
			}
		}
		return array;
	}

	/**
	 * Returns a product of all array values.
	 * 
	 * @param a
	 *            Array of doubles.
	 * @return Product of all array values.
	 */
	public static double multiply(double[] a) {
		double product = 1.0;
		for (double num : a) {
			product *= num;
		}
		return product;
	}

	public static void main(String[] args) {

		try {
			double[] array = readArguments(args);
			System.out.print("Numbers: ");
			for (double num : array) {
				System.out.printf("%.2f, ", num);
			}
			System.out.printf("\nMultiplied: %.2f", multiply(array));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There are no arguments.");
		}
	}

}