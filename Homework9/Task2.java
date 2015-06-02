import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
try{
		int factoriel = 1;
		System.out.print("Please enter the name of file src/");
		String name = "src/"+input.nextLine();
		TextIO.readFile(name);
		
		String word = TextIO.getWord();
		int num=Integer.parseInt(word);
		for (int i = 1; i <=num; i++) {
			factoriel *= i;}
			System.out.println(factoriel);
		}catch(NumberFormatException e){
			System.out.println("The number is not at the first place");
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e){
			System.out.println("Please enter name of file again(File does not exist");
			System.out.println(e.getMessage());
		}
input.close();
	}
}