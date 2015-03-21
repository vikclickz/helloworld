package strings;

public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Aello world";
		System.out.println(str.length() - str.replaceAll("a|e|i|o|u", "").length());
//		System.out.println(str.contains("a,e,i,o"));
		String str1 = "123";
		int num = Integer.parseInt(str1);
		int num2 = Integer.valueOf(str1);
		System.out.println(num2);
		
		int c = str.charAt(0);
		System.out.println(c);
		str.replaceAll("^\\s*$", "%20");
		System.out.println(str);
	}

}
