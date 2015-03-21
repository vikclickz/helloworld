package arrays;

public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotateArray rot = new RotateArray();
		int[] test = {1,2,3,4,5,6,7};
		
		rot.reversedArray(test, 2);

	}
	
	public int[] reversedArray(int[] array, int order){
		
		int len = array.length - order;
		reverse(array,0,len-1);
		reverse(array, len, array.length-1);
		reverse(array, 0, array.length-1);
		return array;
	}

	private void reverse(int[] array, int left, int right) {
		if(array == null || array.length == 1){
			return;
		}
		
		while(left < right){
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
		}
		
	}

}
