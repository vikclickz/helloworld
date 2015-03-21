package OOPConcepts;

public class LooseCouplingA {
	
	
	public static void main(String[] args){
		testCoupling();
	}
	
	public static void testCoupling(){
		InterfaceB b = new LooseCouplingB();
		System.out.println(b.add(10, 23));
		
	}

}
