package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = {{2,3}};
		for(Integer num : printSpiral(matrix)){
			System.out.println();
			System.out.print(num);
		}
		
	}
	static boolean flag = true;
	public static List<Integer> printSpiral(int[][] matrix){
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			if(flag){
				printForward(matrix,i,myList);
			}else{
				printBackward(matrix,i,myList);
			}
			}
		return myList;
		}
	private static void printBackward(int[][] matrix,int row, List<Integer> myList) {
			for (int j = matrix[0].length-1; j >=0 ; j--) {
				System.out.print(matrix[row][j]);
				myList.add(matrix[row][j]);
				
			}
		flag = true;
		
	}
	private static void printForward(int[][] matrix,int row, List<Integer> myList) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[row][j]);
				myList.add(matrix[row][j]);
			}
		flag = false;
		
	}

}
