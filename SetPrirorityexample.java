public class Main extends Thread
{ 
    public void run(){System.out.println(Thread.currentThread().getPriority());}
	public static void main(String[] args) {
		Main thread =new Main();
		thread.setPriority(10);
		thread.start();
	}
}
