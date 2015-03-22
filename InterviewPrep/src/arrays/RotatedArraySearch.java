package arrays;

public class RotatedArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {4,5,6,7,0,1,2};
		System.out.println(rotatedArraySearch(array, array.length, 5));
	}
	
	public static int rotatedArraySearch(int[] array,int key){
		if(null == array || array.length == 0){
			return -1;
		}
		int res = rotatedArraySearch(array,0,array.length-1,key);
		return res;
	}

	private static int rotatedArraySearch(int[] array, int start, int end,int key) {
		if(start > end){
			return -1;
		}
		int mid = start + ((end-start)/2);
		if(key == array[mid]){
			return mid;
		}else if(key < array[mid]){
			return rotatedArraySearch(array, start, mid-1, key);
		}else{
			return rotatedArraySearch(array, mid+1, end, key);
		}
	}
	
	public static int rotatedArraySearch(int[] array, int len, int key){
		int left = 0;
		int right = len -1;
		while(left<=right){
			int mid = (left+right)/2;
			if(key == array[mid]){
				return mid;
			}
			if(array[left] <= array[mid]){
				if(key >= array[left] && key < array[mid]){
					right = mid - 1;
				}else{
					left = mid + 1;
				}
			}
			if(array[right] >= array[mid]){
				if(key > array[mid] && key <= array[right]){
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}
		}
		return -1;
	}

}
