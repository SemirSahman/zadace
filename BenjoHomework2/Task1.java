import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter a expression: ");
		Scanner in = new Scanner (System.in);
	
		String str1 = "";
		String str2 = "";
		int counter = 0;
		char operator='a';
		String  expression = in.nextLine();
		
		for(int i = 0; i < expression.length(); i++){
			char operatorIndex = expression.charAt(i);
			if(operatorIndex =='+' || operatorIndex == '-' || operatorIndex == '*' || operatorIndex == '/'){
				operator = expression.charAt(i);
				counter++;
			} else if (counter == 0) {
				str1 += operatorIndex;
			} else if (counter == 1) {
				str2 += operatorIndex;
			}
		}
		int num1 = 0;
		int num2 = 0;
		str1 = str1.trim();
		str2 = str2.trim();
		try{
		 num1 = Integer.parseInt(str1);
		 num2 = Integer.parseInt(str2);
		} catch (NumberFormatException e){
			System.out.println("Wrong input!");
			e.printStackTrace();
		}
		
		int result = 0; 
		
		switch (operator){
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
		result = num1 * num2;
				break;
		case '/':
			result = num1 / num2;
			break;
		}
		System.out.println(num1 + " " + operator + " " + num2 + " Result is: " + result);
		in.close();
	}

}