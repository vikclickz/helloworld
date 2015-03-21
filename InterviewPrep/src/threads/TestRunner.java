package threads;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Thread t = new Thread(new Runner("Runner"));
		Runner t = new Runner();
		t.start();
		Thread t2 = new Thread(new SecondRunner());
		t.exit(true);
		t2.start();
	}

}
