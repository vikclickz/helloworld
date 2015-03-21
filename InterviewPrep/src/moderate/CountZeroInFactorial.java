package moderate;

public class CountZeroInFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countFactZeros(25));

	}
	
	public static int countFactZeros(int num){
		int count = 0;
		if(num < 0){
			return -1;
		}
		for (int i = 5; num/i > 0 ; i*=5) {
			count = count + num/i;
		}
		return count;
	}

}
