public class Main implements Runnable
{
   public void run(){System.out.print("Run method call");};
	public static void main(String[] args) {
		Main thread=new Main();
		ThreadGroup t1=new ThreadGroup("Parent Thread");
		Thread tg1=new Thread(t1,thread,"start");
		tg1.start();
		Thread tg2=new Thread(t1,thread,"the");
	    tg2.start();
	    Thread tg3=new Thread(t1,thread,"end");
	    tg3.start();
	    System.out.println("thread group items "+t1.getName());
	
	    t1.list();
	}
}
