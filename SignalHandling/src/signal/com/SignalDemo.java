package signal.com;

public class SignalDemo {
	
	public static boolean running = true;
	
	public static void main(String args[]){
		Runtime.getRuntime().addShutdownHook(new Thread(){
			public void run(){
				System.out.println("Shutdown Hook is running");
				//close the files if any
				System.out.println("Shutdown Hook is completed");
				running = false;
			}
			
		});
		int i = 0;
		while (running){
			System.out.println("Main executing" + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 20){
				running = false;
			}
		}
		System.out.println("Application ended");
	}

}
