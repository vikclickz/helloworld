package arrays;

public class FindTopTwoMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] asd = {1,7,4,5,6,2,12,};
		printTopTwoMax(asd);

	}
	
	public static void printTopTwoMax(int[] a){
		int maxOne = 0;
		int maxTwo = 0;
		for (int i = 0; i < a.length; i++) {
			if(maxOne < a[i]){
				maxTwo = maxOne;
				maxOne = a[i];
			}
		}
		System.out.println(maxOne + "::" +maxTwo);
	}

}
