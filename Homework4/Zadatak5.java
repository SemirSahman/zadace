public class Zadatak5 {

	public static void main(String[] args) {

		// Program sadrzi 4 varijable i ispisuje ih u konzolu tako da su
		// sortirane od najmanje ka najvecoj

		int var1 = 7;
		int var2 = 33;
		int var3 = 5;
		int var4 = 18;
		int prvi = 0, drugi = 0, treci = 0, cetvrti = 0;

		if (var1 < var2 && var1 < var3 && var1 < var4) {
			prvi = var1;
			if (var2 < var3 && var2 < var4) {
				drugi = var2;
				if (var3 < var4) {
					treci = var3;
					cetvrti = var4;
				} else {
					treci = var4;
					cetvrti = var3;
				}
			} else if (var3 < var2 && var3 < var4) {
				drugi = var3;
				if (var2 < var4) {
					treci = var2;
					cetvrti = var4;
				} else {
					treci = var4;
					cetvrti = var2;
				}
			} else {
				drugi = var4;
				if (var2 < var3) {
					treci = var2;
					cetvrti = var3;
				} else {
					treci = var3;
					cetvrti = var2;
				}
			}
		} else if (var2 < var1 && var2 < var3 && var2 < var4) {
			prvi = var2;
			if (var1 < var3 && var1 < var4) {
				drugi = var1;
				if (var3 < var4) {
					treci = var3;
					cetvrti = var4;
				} else {
					treci = var4;
					cetvrti = var3;
				}
			} else if (var3 < var1 && var3 < var4) {
				drugi = var3;
				if (var1 < var4) {
					treci = var1;
					cetvrti = var4;
				} else {
					treci = var4;
					cetvrti = var1;
				}
			} else {
				drugi = var4;
				if (var1 < var3) {
					treci = var1;
					cetvrti = var3;
				} else {
					treci = var3;
					cetvrti = var1;
				}
			}
		} else if (var3 < var2 && var3 < var1 && var3 < var4) {
			prvi = var3;
			if (var1 < var2 && var1 < var4) {
				drugi = var1;
				if (var2 < var4) {
					treci = var2;
					cetvrti = var4;
				} else {
					treci = var4;
					cetvrti = var2;
				}
			} else if (var2 < var1 && var2 < var4) {
				drugi = var2;
				if (var1 < var4) {
					treci = var1;
					cetvrti = var4;
				} else {
					treci = var4;
					cetvrti = var1;
				}
			} else {
				drugi = var4;
				if (var1 < var2) {
					treci = var1;
					cetvrti = var2;
				} else {
					treci = var2;
					cetvrti = var1;
				}
			}
		} else {
			prvi = var4;
			if (var1 < var2 && var1 < var3) {
				drugi = var1;
				if (var2 < var3) {
					treci = var2;
					cetvrti = var3;
				} else {
					treci = var3;
					cetvrti = var2;
				}
			} else if (var2 < var1 && var2 < var3) {
				drugi = var2;
				if (var1 < var3) {
					treci = var1;
					cetvrti = var3;
				} else {
					treci = var3;
					cetvrti = var1;
				}
			} else {
				drugi = var3;
				if (var1 < var2) {
					treci = var1;
					cetvrti = var2;
				} else {
					treci = var2;
					cetvrti = var1;
				}
			}
		}
		System.out.println(prvi + " " + drugi + " " + treci + " " + cetvrti);
	}
}