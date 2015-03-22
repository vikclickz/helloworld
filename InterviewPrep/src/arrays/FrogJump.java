package arrays;

public class FrogJump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frogJump(10, 120, 30));
	}
	
	public static int frogJump(int x,int y,int d){
		int jumps = y-x;
		int count = (int) Math.floor(jumps/d);
		count++;
		return count;
	}

}
