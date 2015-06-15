//class representing animals
public class Animal {

	//atributes
	private String name;
	private int partOfDayActive;
	private int waterNeed;

	//constructor
	public Animal(String name, int partOfDayActive, int waterNeed) {
		super();
		this.name = name;
		this.partOfDayActive = partOfDayActive;
		this.waterNeed = waterNeed;
	}

	//toString method
	@Override
	public String toString() {
		return "Animal [name=" + name + ", partOfDayActive=" + partOfDayActive
				+ ", waterNeed=" + waterNeed + "]";
	}

	//seters
	private static Integer timeOfDay = 1;
	private static Integer water = 1;

	/**
	 * this method prints us status about animals
	 */
	public void printStatus() {

		if (timeOfDay == partOfDayActive && water == waterNeed) {
			System.out
					.println("It’s fine. The animal is active and has water.");
		} else if (timeOfDay == partOfDayActive && water < waterNeed) {
			System.out
					.println("The animal is active, but does not have enough water.");
		} else if (timeOfDay != partOfDayActive && water >= waterNeed) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else {
			System.out
					.println("The animal is not active and it does not have enough water.");
		}
	}

	/**
	 * this method changes the day and night by calling it
	 */
	public static void cycleDayNight() {
		if (timeOfDay == 1) {
			timeOfDay = 2;
		} else {
			timeOfDay = 1;
		}
	}

	/**
	 * this method helps us to set amount of water that we want
	 * @param w number(amount) of water we want to set
	 */
	public static void setAmountOfWater(int w) {
		if (water >= 0 && water <= 3) {
			water = w;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
