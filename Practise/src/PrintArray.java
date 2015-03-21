
public class PrintArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = new int[]{5,2,-3,4,1};
		
		for (int i = 0; i < a.length; i++) {
			int value = Math.round(Math.signum(a[i]));
			if(value > 0){
				System.out.print("   "+printStars(a[i]));
			}else if(value < 0){
				System.out.print(printStars(a[i]));
			}
			System.out.println();
		}

	}
	
	private static String printStars(int noOfStars){
		StringBuffer stars = new StringBuffer();
		for(int i=1;i<=Math.abs(noOfStars);i++){
			stars.append("*");
		}
		return stars.toString();
		
	}

}
