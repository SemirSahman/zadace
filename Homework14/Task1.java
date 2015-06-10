public class Task1 {
	/**
	 * Method counts how many time one number repeats
	 * 
	 * @param matrix
	 *            - size of matrix
	 * @param number
	 *            - number that you want to count how many times it repeats
	 * @return - counter variable that shows how many times wanted number is
	 *         repeated
	 */
	public static int countNumber(int[][] matrix, int number) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// putting elements in matrix
		int[][] matrix = { { 2, 2, 2 }, { 9, 8, 7 }, { 5, 2, 1 } };
		// number we want to count
		int number = 2;
		// calling method
		System.out.println(countNumber(matrix, number));
	}

}