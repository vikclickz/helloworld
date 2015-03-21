
public class InterfaceTest implements ITest1,ITest2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceTest test = new InterfaceTest();
		test.myTest();
		System.out.println(test.getClass().getInterfaces().toString());

	}

	@Override
	public void myTest() {
		System.out.println("hello world");
		
	}

}
