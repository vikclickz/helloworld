package arrays;

public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CompressString cstr = new CompressString();
		System.out.println(cstr.compressString("aaaabbbsssccc"));

	}
	
	public String compressString(String str){
		if(null == str)
			return "Invalid Input";
		StringBuffer sbuf = new StringBuffer();
		char[] s = str.toCharArray();
		int repeatCharCounter = 1;
		for (int i = 0; i < s.length; i++) {
			if(i+1 < s.length && s[i] != s[i+1]){
				sbuf.append(s[i]);
				sbuf.append(repeatCharCounter);
				repeatCharCounter = 1;
			}else if(i+1 >= s.length){
				sbuf.append(s[i]);
				sbuf.append(repeatCharCounter);
			}
			else{
			repeatCharCounter++;
			}
		}
		if(sbuf.length() > str.length()){
			return str;
		}
		
		return sbuf.toString();
	}

}
