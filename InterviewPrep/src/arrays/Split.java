package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(changeDateFormat("Last time it rained was on 07/25/2013 and today is 08/09/2013."));
		String inputString = "coming from the 25/11/2009 to the 30/11/2009";
		String[] dates = getDate("coming from the 25/11/2009 to the 30/11/2009");

		System.out.println(dates[0]);
		System.out.println(dates[1]);
		ArrayList<String[]> array1 = new ArrayList<>();
		for (int i = 0; i < dates.length; i++) {
			array1.add(dates[i].split("/"));
		}
		LinkedList<String> resultArray = new LinkedList<>();
		for (String[] location : array1) {
			String a = location[0];
			String b = location[1];
			String c = location[2];
			String test = b + "/" + a + "/" + c;
			resultArray.add(test);
		}
		for (int i = 0; i < resultArray.size(); i++) {
			inputString.replaceFirst(dates[i], resultArray.get(i));
		}
		System.out.println(inputString);
	}

	private static String[] getDate(String desc) {
		int count = 0;
		String[] allMatches = new String[2];
		Matcher m = Pattern
				.compile(
						"(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d")
				.matcher(desc);

		while (m.find()) {
			allMatches[count] = m.group();
			count++;
		}
		return allMatches;
	}
}
