public class Zadatak1 {

	public static void main(String[] args) {

		// Program ispisuje da li je moguce konstruisati trougao sa datim
		// stranicama koje su definisane u varijablama

		int a = 3;
		int b = 0;
		int c = 6;

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out
					.println("Nije moguce konstruisati trougao sa unesenim vrijednostima!");
		} else {
			System.out
					.println("Moguce je konstruisati trougao sa unesenim vrijednostima!");
		}

	}

}
