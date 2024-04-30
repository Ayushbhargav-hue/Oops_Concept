public class SetPrirorityexample extends Thread
{ 
    public void run(){System.out.println(Thread.currentThread().getPriority());}
	public static void main(String[] args) {
		SetPrirorityexample thread =new SetPrirorityexample();
		thread.setPriority(10);
		thread.start();
	}
}
