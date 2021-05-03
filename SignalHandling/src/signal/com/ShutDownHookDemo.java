package signal.com;

public class ShutDownHookDemo {

	public void run(){
		System.out.println("Shutdown Hook is running");
		//close the files if any
		System.out.println("Shutdown Hook is completed");
		SignalDemo.running = false;
	}
	

}
