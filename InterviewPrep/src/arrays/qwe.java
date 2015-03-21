package arrays;

public class qwe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
				System.out.println(x(-1L));


	}
	public static long x(long arg) { return (arg > 1) ? arg * x(arg - 1) : 1; }

}
