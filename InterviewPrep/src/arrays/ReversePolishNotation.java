package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] tokens = {"2","+","3","3","*","5"};
		ReversePolishNotation polish = new ReversePolishNotation();
		System.out.println(polish.evalRPN(tokens));
	}
	
	public static Set<String> permute(String s){
		Set<String> result = new HashSet<>();
		if(s ==null){
			return null;
		}else if(s.length() == 0){
			result.add("");
			return result;
		}
		char firstChar = s.charAt(0);
		String rem = s.substring(1);
		Set<String> words = permute(rem);
		for (String newString : words) {
			for (int i = 0; i < newString.length(); i++) {
				result.add(charAdd(newString,firstChar,i));
			}
		}
		return result;
	}
	
	
	private static String charAdd(String newString, char firstChar, int i) {
		String first = newString.substring(0, i);
		String last = newString.substring(i);
		return first + firstChar + last;
	}

	public int evalRPN(String[] tokens){
		String operators = "+-*/";
		Stack<Integer> numberStack = new Stack<Integer>();
		int result = 0;
		for (String token : tokens) {
			if(!operators.contains(token)){
				numberStack.push(Integer.parseInt(token));
			}else{
				if(numberStack.size()>=2){
				int a = numberStack.pop();
				int b = numberStack.pop();
				switch(token){
				case "+": 
					result = a + b;
					numberStack.push(result);
					break;
				case "-": 
					result = a - b;
					numberStack.push(result);
					break;
				case "*":
					result = a*b;
					numberStack.push(result);
					break;
				case "/":
					result = a/b;
					numberStack.push(result);
					break;
				}
				}
			}
		}
		result = numberStack.pop();
		return result;
	}

}
