class Thread2 extends Thread{
    public void run(){
        System.out.println("Running Thread1 class");
    }
}
public class Thread1 implements Runnable
{ public void run(){
    System.out.println("Running Main class thread");
}
	public static void main(String[] args) {
		
		Thread1 m=new Thread1();
		Thread t1=new Thread(m);
		t1.start();
		Thread1 t2=new Thread1();
		t2.start();
	}
}
