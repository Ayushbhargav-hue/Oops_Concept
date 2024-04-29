public class isalivemethodexample extends Thread
{
    public void run(){
        System.out.println("Run method call "+Thread.currentThread().isAlive());
    }
	public static void main(String[] args) {
	isalivemethodexample thread =new isalivemethodexample();
	System.out.println("Thread is "+thread.isAlive());
	thread.start();
	System.out.println("Thread is "+thread.isAlive());
	}
}
