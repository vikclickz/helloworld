package arrays;

public class ReplaceSpace {

	public void replaceSpace(char[] str,int length){
		int spaceCount = 0;
		int newLength;
		for(int i = 0; i < length; i++){
			if(str[i]==' '){
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount*2;
		str[newLength] = '\0';
		for(int i=length-1; i>=0; i--){
			if(str[i]==' '){
				str[newLength-1] = '0';
				str[newLength-2] = '2';
				str[newLength-3] = '%';
				newLength = newLength - 3;
			}
			else{
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = new char[100];
		String s = "hello world";
		char[] ss = s.toCharArray();
		for(int i = 0; i<ss.length;i++){
			str[i]=ss[i];
		}
		ReplaceSpace result = new ReplaceSpace();
		result.replaceSpace(str,11);
		System.out.print(str);
	}

}
