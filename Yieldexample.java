public class Yieldexample extends Thread{
   public void run(){
    for(int i=1;i<5;i++){
	    System.out.println(Thread.currentThread().getName()+" is running");
	}
}
    public static void main(String[] args){
        Yieldexample example=new Yieldexample();
        Yieldexample example2=new Yieldexample();
        example.start();
        example2.start();
        for(int i=0;i<4;i++){
        example.yield();
        System.out.println(Thread.currentThread().getName()+" is running");
        }
    }
}
