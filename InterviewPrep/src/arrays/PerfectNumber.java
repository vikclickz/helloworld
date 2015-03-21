package arrays;

public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectNumber(5));
	}
	
	public static boolean isPerfectNumber(int num){
		int temp = 0;
		for (int i = 1; i <= num/2; i++) {
			if(num%i==0){
				temp += i;
			}
			if(temp == num){
				return true;
			}
		}
		return false;
	}

}
