
class UserThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i <= 100; i++) {
			System.out.println(i+". This is an user Thread....");
		}
	}
}


public class DaemonThread {

	public static void main(String[] args) {

		UserThread userThread = new UserThread();// creating the UserThread
		
		userThread.setDaemon(true); // changing the thread as Daemon
		
		userThread.start();// Starting the thread
		
		
//		userThread.run();
		
	}

}
