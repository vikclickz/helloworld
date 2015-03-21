package arrays;

public class TypeOfTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] test = { { 36, 36, 30 }, { 47, 8, 60 }, { 46, 96, 90 },
				{ 86, 86, 86 } };
		triangle(test);
		float t = -0.0F;
		float a = -0.0F;
		Double x = Math.floor(a + t);
		int s = x.intValue();
		System.out.println(s);
	}

	/*
	 * Complete the function below.
	 */

	static void triangle(int[][] foo) {
		for (int row = 0; row < foo.length; row++) {
			int side1 = foo[row][0];
			int side2 = foo[row][1];
			int side3 = foo[row][2];

			if ((side1 + side2 > side3)) {
				// If all the sides are equal then its an equilateral triangle.
				if ((side1 == side2) && (side2 == side3)) {
					System.out.println("Equilateral");
				}
				// If two sides are of same size and 1 is different then its an
				// Isosceles triangle.
				else if ((side1 == side2) & (side2 != side3)
						|| (side2 == side3) & (side3 != side1)) {
					System.out.println("Isosceles");
				} else {
					// If neither isosceles nor equilateral.
					invalidTriangle();
				}
			}

			else {
				invalidTriangle();
			}
		}

	}

	/*
	 * Prints "None of these" if the input does not evaluate to a valid
	 * triangle.
	 */
	static void invalidTriangle() {
		System.out.println("None of these");
	}

}
