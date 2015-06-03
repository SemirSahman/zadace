import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input lenght of an array: ");
		int lenght = input.nextInt();
		String[] stringArray = new String[lenght];
		int[] numArray = new int[10];
		char counter = ' ';
		
		System.out.println("Input Array values: ");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print("Input " + (i + 1) + ". value:");
			stringArray[i] = input.next();
		}
		
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < stringArray[i].length(); j++) {
				counter = stringArray[i].charAt(j);
				switch (counter) {
				case '0':
					numArray[0]++;
					break;
				case '1':
					numArray[1]++;
					break;
				case '2':
					numArray[2]++;
					break;
				case '3':
					numArray[3]++;
					break;
				case '4':
					numArray[4]++;
					break;
				case '5':
					numArray[5]++;
					break;
				case '6':
					numArray[6]++;
					break;
				case '7':
					numArray[7]++;
					break;
				case '8':
					numArray[8]++;
					break;
				case '9':
					numArray[9]++;
					break;
						
				}
			}
		}
		
		System.out.println(Arrays.toString(numArray));
		
		input.close();
	}
}