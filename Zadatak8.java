public class Zadatak8 {

	public static void main(String[] args) {

		// Program za date koordinate koje su definisane u varijablama x2, y2,
		// z2 odredjuje koliko su one udaljene od koordinatnog pocetka

		double x1 = 0;
		double y1 = 0;
		double z1 = 0;
		double x2 = 5;
		double y2 = 13;
		double z2 = 7;
		double D = 0;
		D = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1)
				* (z2 - z1));
		System.out.println("Udaljenost iznosi: " + D);

	}

}
