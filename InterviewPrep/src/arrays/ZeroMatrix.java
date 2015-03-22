package arrays;

public class ZeroMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = {{1,3,4},{2,3,0},{3,1,3}};
		setZeroMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
				
			}
			System.out.println();
		}

	}
	
	public static void setZeroMatrix(int[][] matrix){
		if(matrix.length == 0){
			return;
		}
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
	}

}
