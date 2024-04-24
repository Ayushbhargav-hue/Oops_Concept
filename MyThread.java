
public class MyThread implements Runnable{
public void run() {
	System.out.println("First thread");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread thread1=new MyThread();
Thread t1=new Thread(thread1);
t1.start();

	}

}
