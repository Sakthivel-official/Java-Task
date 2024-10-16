
class UserThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("This is User Thread");
	}
}


class DemonThread extends Thread{
	public DemonThread() {
		setDaemon(true);//this thread become daemon, jvm will not run daemon thread
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("This is Daemon Thread: "+i);
		}
	}
}

public class DaemonThreadexa {
	public static void main(String[] args) {

		DemonThread daemonThread = new DemonThread();//Creating the DeamonThread
		
		daemonThread.start();// starting the daemon thread
		
//		UserThread1 userThread = new UserThread1();//Creating the UserThread
//		
//		userThread.start();//Starting the user thread

	}
}
