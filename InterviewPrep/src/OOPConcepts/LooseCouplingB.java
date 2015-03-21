package OOPConcepts;

public class LooseCouplingB implements InterfaceB {
	
	
	public int add(int a,int b){
		
		int sum = a + b;
		
		return sum;
	}
	
	public int subtract(int a,int b){
		return a-b;
	}

}
