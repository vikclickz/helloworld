package collections;

public class OuterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass x = new OuterClass();
		InnerClass c = x.new InnerClass();
		c.displayInner();

	}
	
	public static void test(){
		System.out.println("testing called from inner class");
	}
	
	 class InnerClass{
		
		public void displayInner(){
			test();
			System.out.println("Hello in inner");
		}
	}

}
