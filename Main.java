//example of isAlive method 
class ISALIVE extends Thread{
    public void run(){
        System.out.println("run method call "+Thread.currentThread().isAlive());
    }
}
public class Main
{
	public static void main(String[] args) {
		ISALIVE thread =new ISALIVE();
		System.out.println("Currently thread is alive or not "+thread.isAlive());
		thread.start();
		System.out.println("After start thread is alive or not "+thread.isAlive());
	}
}
