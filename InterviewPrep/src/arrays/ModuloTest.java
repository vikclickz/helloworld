package arrays;


public class ModuloTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int asd = 2;
	    System.out.println();
	    int[] myArray = new int[10];
	    seperateDigits(454, myArray);
	    for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static int[] seperateDigits(int number,int[] numberArray){
		int i = 0;
		while(number > 0){
			
			numberArray[i] = number%10;
			number = number/10;
			i++;
		}
		return numberArray;
	}

}
