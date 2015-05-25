public class Zadatak9 {

	public static void main(String[] args) {

		// Program za dati trocifreni broj koji je definisan u varijabli "broj"
		// odredjuje da li je taj broj djeljiv sa zbirom tih cifara

		int broj = 317;
		int sumaCifara = 0;
		int pomBroj = broj;
		sumaCifara = sumaCifara + broj % 10;
		broj = broj / 10;
		sumaCifara = sumaCifara + broj % 10;
		broj = broj / 10;
		sumaCifara = sumaCifara + broj % 10;
		broj = broj / 10;
		if (pomBroj % sumaCifara == 0) {
			System.out.println("Broj je djeljiv !");
		} else
			System.out.println("Broj nije djeljiv !");

	}

}
