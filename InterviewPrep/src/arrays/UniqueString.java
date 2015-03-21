package arrays;

public class UniqueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String asciistr = null;
		System.out.println(isUniqueChar(asciistr));
	}
	
	public static boolean isUniqueChar(String str){
		if(null == str || 256<str.length()){
			return false;
		}
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			if(char_set[value]){
				return false;
			}
			char_set[value] = true;
		}
		return true;
	}

}
