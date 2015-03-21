package strings;

public class FindContiniousFromJumbled {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "asdfihjasdabcdefhsdjfaabcdefghijfkas";
		String currentValue = "";
		String maxValue = "";
		for (int i = 0; i < s.length()-1; i++) {
			if((s.charAt(i)+1) == (s.charAt(i+1))){
				currentValue = currentValue + s.charAt(i);
				if(currentValue.length() > maxValue.length()){
					maxValue = currentValue;
				}
			}else{
				currentValue = "";
			}
		}
	    System.out.println(maxValue);
	}

}
