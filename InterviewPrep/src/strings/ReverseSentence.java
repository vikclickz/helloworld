package strings;

import sun.security.util.Length;

public class ReverseSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String s = reverse(" ");
		String s2 = " ";
		System.out.println(s2.isEmpty());
		System.out.println(s2.replaceAll(" ", ""));
		System.out.println(s2.length());
//		System.out.println(s.length());
	}
	
	public static String reverse(String s){
		if(null == s || s.isEmpty()){
            return null;
        }
		s = s.trim();
		String[] charArray = s.split(" ");
		for(int i=0;i<charArray.length/2;i++){
			String temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];
			charArray[charArray.length - 1 - i] = temp;
		}
		String s1 = "";
		for (String string : charArray) {
			s1 = s1 + string;
			s1 = s1 + " ";
		}
		return s1;
	}

}
