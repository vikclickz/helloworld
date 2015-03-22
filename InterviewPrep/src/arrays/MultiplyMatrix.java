package arrays;

public class MultiplyMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] m1 = {{1,2},{3,4}};
		int[][] m2 = {{5,6},{7,8}};
		int[][] result = multiplyMatrix(m1, m2);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]);
				
			}
			System.out.println();
		}

	}
	
	public static int[][] multiplyMatrix(int[][] m1, int[][] m2){
		int[][] result = new int[m1.length][m1[0].length];
		if(m1[0].length != m2.length){
			return null;
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				for (int k = 0; k < m1.length; k++) {
					result[i][j] = result[i][j] + m1[i][k] * m2[k][j];
				}
			}
		}
		return result;
	}

}
