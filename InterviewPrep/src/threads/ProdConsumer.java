package threads;

import java.util.Vector;

public class ProdConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> sharedQueue = new Vector<>();
		int capacity = 5;
		Thread prodThread = new Thread(new Producer(sharedQueue, capacity),"Producer");
		Thread conThread = new Thread(new Consumer(sharedQueue, capacity),"Consumer");
		prodThread.start();
		conThread.start();
	}

}
