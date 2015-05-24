public class Zadatak11 {

	public static void main(String[] args) {

		// Program koji odredjuje u koliko sati i munuta avion slijece na
		// aerodrom ukoliko nam je poznato kada avion polijece i koliko minuta
		// traje let

		int satPolijetanja = 5;
		int minutePolijetanja = 55;
		int minuteLeta = 65;
		int satDolaska = 0;
		int minuteDolaska = 0;
		int pomocna = 0;
		pomocna = minuteLeta + minutePolijetanja;
		if (pomocna > 60) {
			minuteDolaska = pomocna;
			pomocna = pomocna / 60;
			pomocna = pomocna * 60;
			minuteDolaska = minuteDolaska - pomocna;
			pomocna = pomocna / 60;
			satDolaska = satPolijetanja + pomocna;
			System.out.println("Vrijeme dolaska aviona je u " + satDolaska
					+ " : " + minuteDolaska);
		} else {
			System.out.println("Vrijeme dolaska aviona je u " + satDolaska
					+ " : " + pomocna);
		}

	}

}
