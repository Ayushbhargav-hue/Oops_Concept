public class lambdawiththread{
	 
    public static void main(String[] args) {
       Runnable runnable=()->System.out.println("Lambda experission with thread");
       Thread thread =new Thread(runnable);
       thread.start();
    }

  
}