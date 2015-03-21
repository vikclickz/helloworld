package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		fetchInput();

	}

	private static void fetchInput() throws IOException {
		boolean flag = false;
		String input = "";
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			input = br.readLine();
			Integer.valueOf(input);
			StringTokenizer token = new StringTokenizer(input, " ");
			while(token.hasMoreTokens()){
			String inputNum = token.nextToken();
			Pattern pattern = Pattern.compile("^[0-9]*$");
			Matcher matcher = pattern.matcher(inputNum);
			if (matcher.matches() && Integer.valueOf(inputNum) >= 1) {
				flag = true;
				int[] numArray = populateArray(Integer.valueOf(inputNum));
				int count = getCount(numArray, Integer.valueOf(inputNum));
				System.out.println(count);
			} else {
				System.out.println("Invalid Input");
			}
			}

		} while (!flag);

	}

	private static int getCount(int[] numArray, int number) {
		int count = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] != 0 && ((number % numArray[i]) == 0)) {
				count++;
			}
		}
		return count;
	}

	private static int[] populateArray(int number) {
		int numLen = Integer.toString(number).length();
		int[] numArray = new int[numLen];

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = number % 10;
			number = number / 10;
		}
		return numArray;
	}

}
