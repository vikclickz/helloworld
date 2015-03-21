package arrays;

public class MergeTwoSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = {2,4,6};
		int[] array2 = {1,3,5};
		int[] mergedArray = mergeArrays(array1,array2);
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.println(mergedArray[i]);
		}
	}

	private static int[] mergeArrays(int[] array1, int[] array2) {
		int[] resultArray = new int[2*Math.max(array1.length, array2.length)];
		int j = 0;
		int i = 0;
		int c = 0;
		while(i < array1.length && j < array2.length){
			if(array1[i] > array2[j]){
				resultArray[c] = array2[j];
				j++;
				c++;
			}else if(array1[i] < array2[j]){
				resultArray[c] = array1[i];
				i++;
				c++;
			}
			
		}
		while(i < array1.length){
			resultArray[c] = array1[i];
			i++;
		}
		while(j < array2.length){
			resultArray[c] = array2[j];
			j++;
		}
		return resultArray;
		}
	}


