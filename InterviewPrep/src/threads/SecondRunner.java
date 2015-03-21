package threads;

public class SecondRunner implements Runnable{

	
	
	@Override
	public void run() {
		System.out.println("in second here");
		Runner run = new Runner();
		run.exit(true);
	}
}
