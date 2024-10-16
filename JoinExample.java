
public class JoinExample extends Thread {

	public void run() {
		
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		//a thread dies or move into dead state automatically
		//when its run method completes the execution of statement
		
		// a Thread can also dead when the stop method is called
		
		JoinExample j1 = new JoinExample();		
		JoinExample j2 = new JoinExample();
		JoinExample j3 = new JoinExample();
		
		j1.start();
		j1.join();
		
		j2.start();
		j3.start();
//		j2.join();
//		j3.join();
	}

}
