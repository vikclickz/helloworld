package threads;

public class Runner extends Thread{

	public static volatile boolean bExit = false;
	public String name;
	public Runner(String name){
		this.name = name;
	}
	public Runner(){
		
	}
	public void exit(boolean b){
		this.bExit = b;
	}
	@Override
	public void run() {
		System.out.println("in here");
		int i=0;
		while(!bExit){
			System.out.println("Running :: "+i);
			i++;
		}
		
	}

}
