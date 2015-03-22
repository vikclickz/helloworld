package strings;

import java.util.Stack;

public class ValidPallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(isValidPallindrome("durrud"));
	}
	
	public static boolean isValidPallindrome(String s){
		String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(str);
		Stack<Character> stack = new Stack<>();
		int slow = 0;
		System.out.println(str.length());
		while(slow < str.length()/2){
			stack.push(str.charAt(slow));
			slow++;
		}
		if(str.length()%2 != 0){
			slow = slow + 1;
			
		}
		for (int i = slow; i < str.length(); i++) {
			if(str.charAt(i) != stack.pop()){
				return false;
			}
		}
		return true;
	}

}
