package arrays;

public class TwoDArrayMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] test = {{3,0,3},{4,3,2}};
		//ystem.out.println(test.length);
		//System.out.println(test[0].length);
		setZeros(test);
	}
	
	public static void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(row[i] || column[j]){
					matrix[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
