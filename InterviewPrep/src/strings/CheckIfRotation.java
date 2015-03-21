package strings;

public class CheckIfRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		String s1s1 = s1 + s1;
		System.out.println(s1s1.indexOf(s2)!= -1);

	}

}
