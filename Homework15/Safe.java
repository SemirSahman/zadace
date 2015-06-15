//class representing safe
public class Safe {
	

	//atributes
	private String name;
	private int currentMoney;

	//toString method
	@Override
	public String toString() {
		return "Safe [name=" + name + ", currentMoney=" + currentMoney + "]";
	}
//constructor
	public Safe(String name) {
		super();
		this.name = name;
		this.currentMoney = 0;
	}

	
	/**
	 * this method adds money
	 * @param money value of money we want to add
	 */
	public void addMoney(int money) {
		currentMoney += money;
	}

	
	/**
	 * this method clears all money and in safe is 0 money
	 */
	public void clear() {
		while (currentMoney > 0) {
			currentMoney--;
		}
	}

	
	/**
	 * this method prints us information about safe
	 */
	public void printInformation() {
		if (currentMoney == 0) {
			System.out.println("It is empty");
		} else if (currentMoney > 0 && currentMoney < 21) {
			System.out.println("There is some but not much");
		} else if (currentMoney > 20 && currentMoney < 101) {
			System.out.println("There is some");
		} else {
			System.out.println("There is a lot");
		}
	}

}
