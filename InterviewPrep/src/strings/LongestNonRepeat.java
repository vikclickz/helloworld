package strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class LongestNonRepeat {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		Integer[] asd = {1,3,4,5,6};
		List<Integer> test = new ArrayList<>((Arrays.asList(asd)));
		test.remove(2);
		asd = (Integer[]) test.toArray();
		for (int i = 0; i < asd.length; i++) {
			System.out.println(asd[i]);
		}
		String s1 = "abcd";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(Character.isUpperCase(s1.charAt(i)));
		}
		
		String s2 = "abcd";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		s1 = s1+"sd";
		int f = 33;
		System.out.println(f);
		change(f);
		System.out.println(f);
//		String s = "VikrantMishra";
//		char[] arr = s.toCharArray();
//		int pre = 0;
//	 
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//	 
//		for (int i = 0; i < arr.length; i++) {
//			if (!map.containsKey(arr[i])) {
//				map.put(arr[i], i);
//			} else {
//				pre = Math.max(pre, map.size());
////				i = map.get(arr[i]);
//				map.clear();
//			}
//		}
//	 
//		System.out.println(Math.max(pre, map.size()));

	}
	
	public static void change(int s){
		s = 55;
		System.out.println(s);
	}

}
