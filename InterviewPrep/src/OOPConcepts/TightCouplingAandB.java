package OOPConcepts;

public class TightCouplingAandB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCoupling();
		System.out.println(4845%1000);
		//test(null);
	}
	
	public static void test(OutOfMemoryError i){
		System.out.println("string");
	}
	
	public static void test(ArithmeticException i){
		System.out.println("integer");
	}
	
	public static void test(Object i){
		System.out.println("object");
	}
	
	
	public static void testCoupling(){
		InterfaceB b = new LooseCouplingB();
		System.out.println("addition :: "+b.add(10, 23));
		LooseCouplingB tightCoupleEx = new LooseCouplingB();
		System.out.println(tightCoupleEx.subtract(12, 5));
		try {
			System.out.println("in try");
		} catch (Exception e) {
			System.out.println("in catch");
		}finally{
			System.out.println("in finally");
			int x = 4/0;
			System.out.println(" va "+x);
			System.out.println("after exception");
		}
	}
	
	

}
