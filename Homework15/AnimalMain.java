public class AnimalMain {

	public static void main(String[] args) {

		Animal a1 = new Animal("Nindja kornjaca", 1, 1);
		Animal a2 = new Animal("Mjau Mjau", 2, 3);
		a1.printStatus();
		a2.printStatus();
		Animal.cycleDayNight();
		Animal.setAmountOfWater(3);
		a1.printStatus();
		a2.printStatus();

	}

}
