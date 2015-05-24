public class Zadatak7 {

	public static void main(String[] args) {

		// Program sadrzi jednu cetverocifrenu varijablu i ispisuje na konzolu
		// sumu njenih cifara.

		int varijabla = 2855;
		int suma = 0;
		suma = suma + varijabla % 10;
		varijabla = varijabla / 10;
		suma = suma + varijabla % 10;
		varijabla = varijabla / 10;
		suma = suma + varijabla % 10;
		varijabla = varijabla / 10;
		suma = suma + varijabla % 10;
		varijabla = varijabla / 10;
		System.out.println("Suma cifri je:" + suma);

	}

}
