package arrays;

public class SwapNumbersNoTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		a = a + b;
		b = Math.abs(a - b);
		a = a - b;
		System.out.println(a + " "+b);

	}

}
