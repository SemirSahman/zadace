public class Task3 {

	public static boolean hasNumbers(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasNumbers("Svi na sjever Sarajevo 4ever"));

	}

}
