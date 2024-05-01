public class Sleepthreadexample extends Thread{
   public void run(){
    for(int i=1;i<=5;i++){try{Thread.sleep(2000);}catch(Exception e){}
	    System.out.print(i+" ");
	}
	System.out.print("Sleep ends");
	
}
    public static void main(String[] args){
        Sleepthreadexample example=new Sleepthreadexample();
        example.start();
    }
}
