import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int lenght = input.nextInt();
		int[] arr = new int[lenght];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number for " + i + " index:");
			arr[i] = input.nextInt();
		}
		System.out.println("Enter Q:");
		int Q = input.nextInt();
		boolean temp = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Q)
				temp = true;
		}
		System.out.println("Nuber Q exists in array:" + temp);

	}

}