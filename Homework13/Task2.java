public class Task2 {

	public static void main(String[] args) {
		int[] arr = new int[args.length];

		int min = 0;
		try{
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) < min) {
				min = Integer.parseInt(args[i]);
			}
		}
		System.out.println(min);
		}catch(Exception e){
			System.out.println("Please enter only numbers");
		}
	}

}
