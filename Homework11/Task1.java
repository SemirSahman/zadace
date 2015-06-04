public class Task1 {

	public static int getMin2(int a, int b) {
		if (a < b) {
			return a;

		} else if (b < a) {
			return b;
		} else
			return a;
	}

	public static int getMin3(int a, int b, int c) {
		if (getMin2(a, b) < c) {
			return getMin2(a, b);
		} else if (getMin2(a, b) > c) {
			return c;
		} else
			return c;
	}

	public static void main(String[] args) {
		System.out.println(getMin2(9, 5));
		System.out.println(getMin3(9, 5, 2));

	}

}
