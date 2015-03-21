package OOPConcepts;

public class CreateDeadlock {

	static String s1 = "ter";
	static String s2 = "asd";
	
	Thread a = new Thread(){
		public void run(){
			while(true){
				synchronized (s1) {
					synchronized (s2) {
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};
	
	Thread b = new Thread(){
		public void run(){
			while(true){
				synchronized (s2) {
					synchronized (s1) {
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		CreateDeadlock deadlock = new CreateDeadlock();
		deadlock.a.start();
		deadlock.b.start();

	}

}
