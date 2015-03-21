package strings;

public class CompressString {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myString = "aacabbbc";
		int size = countCompression(myString);
		System.out.println(size);
		String newString = "";
		if(size < myString.length()){
		    newString = compressString(myString);
		}else{
			newString = myString;
		}
		System.out.println(newString);

	}
	
	
	private static int countCompression(String myString) {
		if(null == myString || myString.isEmpty()){
			return 0;
		}
		char last = myString.charAt(0);
		int count = 1;
		int size = 0;
		for (int i = 1; i < myString.length(); i++) {
			if(myString.charAt(i) == last){
				count++;
			}else{
				last = myString.charAt(i);
				size = size + 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size = size + 1 + String.valueOf(count).length();
		return size;
	}

	public static String compressString(String str){
		if(null == str || str.isEmpty()){
			return null;
		}
		int characterCount = 1;
		char last = str.charAt(0);
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) == last){
				characterCount++;
			}else{
				stringBuilder.append(last);
				stringBuilder.append(characterCount);
				last = str.charAt(i);
				characterCount = 1;
			}
		}
		stringBuilder.append(last);
		stringBuilder.append(characterCount);
		return stringBuilder.toString();
	
	}

}
