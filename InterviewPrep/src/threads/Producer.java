package threads;

import java.util.Vector;

public class Producer implements Runnable {
	Vector<Integer> sharedQueue;
	int capacity;
	
	public Producer(Vector<Integer> sharedQueue, int capacity) {
		super();
		this.sharedQueue = sharedQueue;
		this.capacity = capacity;
	}

	@Override
	public void run()  {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("produced :: "+i);
			try{
			produce(i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

	private void produce(int i) throws InterruptedException {
		
		while(sharedQueue.size() == capacity){
			synchronized (sharedQueue) {
				System.out.println("Queue is full "+Thread.currentThread().getName()+" is waiting size :: "+sharedQueue.size());
				sharedQueue.wait();
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
		
	}
	
	

}
