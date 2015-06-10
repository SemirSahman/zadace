public class Task2 {

	/**
	 * method that counts sum of rows
	 * 
	 * @param matrix
	 *            with values that we have initialized
	 * @param i
	 *            index of row
	 * @return sum of row
	 */
	public static int sumOfRows(int[][] matrix, int i) {

		int sum = 0;
		for (int j = 0; j < matrix.length; j++) {
			sum += matrix[i][j];
		}
		return sum;

	}

	/**
	 * method that counts sum of columns
	 * 
	 * @param matrix
	 *            with values that we have initialized
	 * @param j
	 *            index of column
	 * @return sum of columns
	 */

	public static int sumOfcolumns(int[][] matrix, int j) {

		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][j];
		}
		return sum;

	}

	/**
	 * method that counts how many rows and columns have sum that is equal to 0
	 * 
	 * @param matrix
	 *            with values that we have initialized
	 * @return counter variable that counts how many rows and columns have sum
	 *         that is equal to 0
	 */

	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {

			if (sumOfRows(matrix, i) == 0)
				counter++;
		}
		for (int j = 0; j < matrix.length; j++) {

			if (sumOfcolumns(matrix, j) == 0)
				counter++;

		}
		return counter;

	}

	public static void main(String[] args) {
		// putting elements in matrix
		int[][] arr = { { 1, -2, 1 }, { 3, 0, -3 }, { -4, 2, 2 } };
		// calling a method
		System.out.println(getNumOfZeroRowsAndColumns(arr));

	}

}