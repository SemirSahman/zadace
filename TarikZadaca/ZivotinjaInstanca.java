public class ZivotinjaInstanca {

	public static void main(String[] args) {

		Zivotinja z1 = new Zivotinja("Tiger", "Mammal",
				"Black/Orange or Black/White", 15,
				"Siberian taiga/Indian subcontinent", true, "rooooar");
		System.out.println(z1);

		Zivotinja z2 = new Zivotinja("Gorilla", "Mammal", "Black", 40,
				"Central Africa", false, "hrghhh");
		System.out.println(z2);
		
		Zivotinja z3 = new Zivotinja("Dog", "Mammal", "All variety of colors", 15, "All continents", true, "av av");
		System.out.println(z3);

	}

}
