package strings;

public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcd";
		String t = "daba";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t){
		char[] testArray = s.toCharArray();
		int[] letters = new int[256];
		for (char c : testArray) {
			letters[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			int c = t.charAt(i);
			if(--letters[c] < 0){
				return false;
			}
		}
		return true;
		
	}

}
