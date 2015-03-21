package arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Pattern pattern = Pattern.compile("^[0-9]");
		String s = "hello";
		Matcher match = pattern.matcher(s);
		System.out.println(match.matches());

	}

}
