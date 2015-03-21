package moderate;

public class NumberToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(numToString(4845));
		System.out.println(3454%1000);
	}
	
	public static String[] digits = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	public static String[] teens = {"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	public static String[] tens = {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	public static String[] bigs = {"","Thousand","Million"};
	
	public static String numToString(int number){
		if(number == 0){
			return "Zero";
		}else if(number < 0){
			return "Negative" + numToString(number*-1);
		}
		int count = 0;
		String str = "";
		while(number > 0){
			if(number % 1000 != 0){
				str = numToString100(number%1000) + bigs[count] + " " + str;
			}
			number = number / 1000;
			count++;
		}
		return str;
	}

	private static String numToString100(int number) {
		String str = "";
		if(number >= 100){
			str = str + digits[number/100 - 1] + " Hundred ";
			number = number % 100;
		}
		
		if(number >= 11 && number <= 19){
			return str + teens[number - 11] + " ";
		}else if(number == 10 || number >= 20){
			str = str + tens[number/10-1] + " ";
			number = number % 10;
		}
		if(number >= 1 && number <= 9){
			str = str + digits[number-1] + " ";
		}
		return str;
	}

}
