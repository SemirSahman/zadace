public class Zadatak12 {

	public static void main(String[] args) {

		// Program odredjuje da li je lopta sa datim poluprecnikom dobre
		// kvalitete. U ovom slucaju dobra kvaliteta znaci da lopta ima volumen
		// od 6.014 sa odstupanjem od 0.05%

		double poluprecnik = 1.13;
		double V = 0;
		V = (4 / 3) * poluprecnik * poluprecnik * poluprecnik * Math.PI;
		if (V <= 6.017007 && V >= 6.010993) {
			System.out.println("Lopta je dobre kvalitete");
		} else {
			System.out.println("Lopta nije dobre kvalitete");
		}

	}

}
