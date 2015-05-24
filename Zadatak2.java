public class Zadatak2 {

	public static void main(String[] args) {

		// Program ispisuje da li se vrijednost koja je definisana u varijabli a
		// nalazi izmedju 5 i 7.5 ili izmedju 7.5 i 10

		double a = 13.5;

		if (a < 5 || a > 10) {
			System.out.println("A se nalazi van opsega !");
		} else if (a >= 5 && a <= 7.5) {
			System.out.println("A se nalazi izmedju 5 i 7.5 !");
		} else if (a > 7.5 && a <= 10) {
			System.out.println("A se nalazi izmedju 7.5 i 10 !");
		}

	}

}
