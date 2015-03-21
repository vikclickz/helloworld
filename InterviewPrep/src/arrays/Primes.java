package arrays;

public class Primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 17;
		int sqrtA = (int) Math.sqrt(a);
		System.out.println(sqrtA);
		for (int i = 2; i <= sqrtA; i++) {
			if (a % i == 0) {
				System.out.println("not a prime number");
			}
		}

		long result = 1;
		int[] array1 = new int[30];
		for (int i = 1; i < 10; i++) {
			if (isPrime(i)) {
				result++;
			}
		}
		System.out.println(result);
	}

	private static boolean isPrime(long n) {
		boolean result = false;
		if(n==2 || n==3 || n == 1){
			return true;
		}
		for (long i = 2; i < (long) Math.sqrt(n); i++) {
			if (n % i == 0) {
				result = false;
				break;
			} else
				result = true;
		}
		return result;
	}

}
