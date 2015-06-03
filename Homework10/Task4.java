import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		char[] arr = { 'H', 'O', 'R', 'D', 'E', 'Z', 'L', 'A', '8', '7' };
		Scanner input = new Scanner(System.in);
		System.out.println("Input N");
		int N = input.nextInt();
		while (N > 0) {
			char arr2 = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = arr2;
			N--;
		}
		while (N < 0) {
			char arr2 = arr[0];
			for (int i = 0; i <arr.length-1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length-1] = arr2;
			N++;
		}
		System.out.println(Arrays.toString(arr));
	}

}