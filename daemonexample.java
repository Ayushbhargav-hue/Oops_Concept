public class daemonexample extends Thread
{ public void run(){System.out.println("this is child thread");}
	public static void main(String[] args) {
		System.out.println("This is parent thread");
		daemonexample thread=new daemonexample();
		thread.setDaemon(false);
		thread.start();
	}
}
