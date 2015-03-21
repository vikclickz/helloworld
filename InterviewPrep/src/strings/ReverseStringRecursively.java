package strings;

public class ReverseStringRecursively {

	public static String reverseString = "";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "abcd";
		System.out.println(reverseString(testString));
	}
	
	public static String reverseString(String str){
		
		if(str.length() == 0){
			return str;
		}
		reverseString = str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
		return reverseString;
	}
	

}
