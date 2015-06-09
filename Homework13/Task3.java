public class Task3 {
	public static int getCountOfNumbers(String s){
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57){
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		
		if(args.length == 1){
			int digits = getCountOfNumbers(args[0]);
			if(digits != 0){
				System.out.println(args[0] + " contains " + digits + " numbers!");				
			} else {
				System.out.println(args[0] + " does not contain any numbers!");
			}
		} else if (args.length > 1){
			System.out.println("Please pass only one String to the program.");
		} else {
			System.out.println("Please pass one String to the program.");			
		}
		
	}
	
	/**
	 * Returns number of digit characters in given String.
	 * @param s A String.
	 * @return Number of digit characters.
	 */

}