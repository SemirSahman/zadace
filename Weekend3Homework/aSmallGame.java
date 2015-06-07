import java.util.Arrays;
import java.util.Scanner;

public class aSmallGame {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] arr = randomArr();
		long a = System.currentTimeMillis();
		while(allZeroInArr(arr)==false){
			try{
			System.out.println("Enter index:");
			int N = input.nextInt();
			arr=game(arr, N);
			System.out.println(Arrays.toString(arr));
			}catch (IndexOutOfBoundsException ex){
				System.out.println("Index must be betwen 0 and 4 !");
			}
		}
		long b = System.currentTimeMillis();
		long c = b-a;
		System.out.println("Time: "+c+" miliseconds.");

	}

	public static int[] randomArr() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 4) + 1);
		}
		return arr;
	}

	public static boolean allZeroInArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] game(int[] arr, int N) {
		if (arr[N] == 0) {
			return arr;
		} else if (arr[N] % 2 == 0) {
			if (N == 0) {
				arr[N + 1] += arr[N];
				if (arr[N + 1] > 4) {
					arr[N + 1] = 4;
				}
				arr[N] -= 1;
				if (arr[N] < 0) {
					arr[N] = 0;
				}
				return arr;
			} else if (N == 4) {
				arr[N - 1] += arr[N];
				if (arr[N - 1] > 4) {
					arr[N - 1] = 4;
				}
				arr[N] -= 1;
				if (arr[N] < 0) {
					arr[N] = 0;
				}
				return arr;
			} else {
				arr[N + 1] += arr[N];
				if (arr[N + 1] > 4) {
					arr[N + 1] = 4;
				}
				arr[N - 1] += arr[N];
				if (arr[N - 1] > 4) {
					arr[N - 1] = 4;
				}
				arr[N] -= 1;
				if (arr[N] < 0) {
					arr[N] = 0;
				}
				return arr;
			}
		} else {
			if (N == 0) {
				arr[N + 1] -= arr[N];
				if (arr[N + 1] < 0) {
					arr[N + 1] = 0;
				}
				arr[N] -= 1;
				if (arr[N] < 0) {
					arr[N] = 0;
				}
				return arr;
			} else if (N == 4) {
				arr[N - 1] -= arr[N];
				if (arr[N - 1] < 0) {
					arr[N - 1] = 0;
				}
				arr[N] -= 1;
				if (arr[N] < 0) {
					arr[N] = 0;
				}
				return arr;
			} else {
				arr[N + 1] -= arr[N];
				if (arr[N + 1] < 0) {
					arr[N + 1] = 0;
				}
				arr[N - 1] -= arr[N];
				if (arr[N - 1] < 0) {
					arr[N - 1] = 0;
				}
				arr[N] -= 1;
				if (arr[N] < 0) {
					arr[N] = 0;
				}
				return arr;
			}
		}
	}
}