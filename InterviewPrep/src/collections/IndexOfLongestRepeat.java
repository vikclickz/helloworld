package collections;

import java.util.HashMap;

public class IndexOfLongestRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int indexOfRepeat(String str){
		if(null != str || str.isEmpty()){
			return 0;
		}
		HashMap<Character,Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		return 0;
	}

}
