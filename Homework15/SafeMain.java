public class SafeMain {

	public static void main(String[] args) {

		Safe s = new Safe("Sezam");
		s.printInformation();
		s.addMoney(30);
		s.printInformation();
		s.addMoney(100);
		s.printInformation();
		s.clear();
		s.printInformation();

	}

}
