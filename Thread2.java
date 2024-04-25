class Thread1 extends Thread{
    public void run(){
        System.out.println("Running Thread1 class");
    }
}

public class Thread2 extends Thread
{ public void run(){
    System.out.println("Running Thread2 class");
}
	public static void main(String[] args) {
		
	        Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
	}
}
