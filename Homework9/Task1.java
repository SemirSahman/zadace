import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of day in week: ");
		int day = in.nextInt();
		
		switch (day){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Workday !");
			break;
		case 6:
		case 7:
			System.out.println("Weekend !");
			break;
		}
		
		

	}

}
