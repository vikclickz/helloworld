package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello0World";
		String pattern = "eld";
		System.out.println(str.indexOf(pattern));
		String reversedString = new StringBuffer(str).reverse().toString();
		System.out.println(reversedString);
		
		StringBuffer sb = new StringBuffer();
		char[] strChar = str.toCharArray();
		System.out.println(strChar.length);
		for(int i = strChar.length-1; i>=0 ; i-- ){
			sb.append(strChar[i]);
		}
		System.out.println(sb.toString());
		System.out.println(str.substring(1)+str.charAt(0));
		
		str.replaceAll("\0", "%20");
		System.out.println(str);
		System.out.println(str.matches(".*\\d.*"));
		String test = "abc123";
		Pattern pattern1 = Pattern.compile(".*[^0-9].*");
		Matcher match = pattern1.matcher(test);
		if(match.matches()){
			System.out.println("only digits");
		}
	}

}
