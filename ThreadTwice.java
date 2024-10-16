
public class ThreadTwice extends Thread{
	
	public void run() {
		System.out.println("Thread is running...");
	}	
	
	public static void main(String[] args) throws InterruptedException {

		//what if we call java run method insted start method
		
		// Each thread start in a seprates call stack
		//invoking the run method from the main thread the run method goes on to the
		//current call stack rather than at the beginning of a new call stack

		
		ThreadTwice t1 = new ThreadTwice();
		
		t1.start();//invokes run() method
		
//		t1.join();
//		t1.start(); //throw IllegalThreadState Exception
		
		t1.run();//runs fine but its does not start as a seperate stack

	}

}
