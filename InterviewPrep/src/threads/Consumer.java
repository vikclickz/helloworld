package threads;

import java.util.Vector;

public class Consumer implements Runnable {
	
	Vector<Integer> sharedQueue;
	int capacity;
	public Consumer(Vector<Integer> sharedQueue, int capacity) {
		super();
		this.sharedQueue = sharedQueue;
		this.capacity = capacity;
	}
	
	@Override
	public void run() {
			
		while(true){
			try{
				System.out.println("Consuming :: "+consumed());
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

	private int consumed() throws InterruptedException {
		while(sharedQueue.isEmpty()){
			synchronized (sharedQueue) {
				System.out.println("Queue is empty :: "+Thread.currentThread().getName()+" is waiting size :: "+sharedQueue.size());
				sharedQueue.wait();
			}
		}
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			return sharedQueue.remove(0);
		}
	}
	

}
