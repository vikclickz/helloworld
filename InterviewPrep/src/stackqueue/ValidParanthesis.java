package stackqueue;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isValid("{[[]]}"));

	}
	
	public static boolean isValid(String s){
		char[] charArray = s.toCharArray();
		Stack<Character> result = new java.util.Stack<>();
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		for (char c : charArray) {
			if(map.keySet().contains(c)){
				result.push(c);
			}else if(map.values().contains(c)){
				if(!result.isEmpty() && map.get(result.peek()) == c){
					result.pop();
				}
			}
		}
		return result.isEmpty();
	}

}
