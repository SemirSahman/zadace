import java.util.Scanner;

public class Task3 {
	
	/**
	 * 
	 * @param matr matrix with values that we have initialized
	 * @param x is index of raw 
	 * @param y is index of column
	 * @return maxPoint number of maximal points
	 */

	public static int getMaxPoints(int matr[][], int x, int y) {
		int maxPoint = 0;
		if (x == 1 && y == 1) {
			maxPoint = matr[x][y];
			return maxPoint;
		} else if (x == 0 && y == 0) {
			if (matr[x + 1][y + 2] > matr[x + 2][y + 1]) {
				maxPoint = matr[x + 1][y + 2];
			} else {
				maxPoint = matr[x + 2][y + 1];
			}
			return maxPoint;
		} else if (x == 0 && y == 1) {
			if (matr[x + 2][y - 1] > matr[x + 2][y + 1]) {
				maxPoint = matr[x + 2][y - 1];
			} else {
				maxPoint = matr[x + 2][y + 1];
			}
			return maxPoint;
		} else if (x == 0 && y == 2) {
			if (matr[x + 2][y - 1] > matr[x + 1][y - 2]) {
				maxPoint = matr[x + 2][y - 1];
			} else {
				maxPoint = matr[x + 1][y - 2];
			}
			return maxPoint;
		} else if (x == 1 && y == 0) {
			if (matr[x - 1][y + 2] > matr[x + 1][y + 2]) {
				maxPoint = matr[x - 1][y + 2];
			} else {
				maxPoint = matr[x + 1][y + 2];
			}
			return maxPoint;
		} else if (x == 1 && y == 2) {
			if (matr[x - 1][y - 2] > matr[x + 1][y - 2]) {
				maxPoint = matr[x - 1][y - 2];
			} else {
				maxPoint = matr[x + 1][y - 2];
			}
			return maxPoint;
		} else if (x == 2 && y == 0) {
			if (matr[x - 2][y + 1] > matr[x - 1][y + 2]) {
				maxPoint = matr[x - 2][y + 1];
			} else {
				maxPoint = matr[x - 1][y + 2];
			}
			return maxPoint;
		} else if (x == 2 && y == 1) {
			if (matr[x - 2][y - 1] > matr[x - 2][y + 1]) {
				maxPoint = matr[x - 2][y - 1];
			} else {
				maxPoint = matr[x - 2][y + 1];
			}
			return maxPoint;
		} else if (x == 2 && y == 2) {
			if (matr[x - 1][y - 2] > matr[x - 2][y - 1]) {
				maxPoint = matr[x - 1][y - 2];
			} else {
				maxPoint = matr[x - 2][y - 1];
			}
			return maxPoint;
		}
		return maxPoint;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// putting elements in matrix
		int[][] matr = { { 5, 2, 5 }, { 1, 4, 8 }, { -4, -7, 9 } };
		System.out.println("Unesite vrijednost x");
		//Entering index of row
		int x = input.nextInt();
		System.out.println("Unesite vrijednost y");
		//Entering index of column
		int y = input.nextInt();
		//caling method
		System.out.println("Maximalan broj poena je "
				+ getMaxPoints(matr, x, y));
		
		input.close();

	}

}