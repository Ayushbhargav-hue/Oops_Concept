public class joinexample extends Thread
{ public void run(){
    for(int i=1;i<5;i++){
	    try{Thread.sleep(1000);}catch(Exception e){}
	    System.out.println(i);
	}}
	public static void main(String[] args) {
	    joinexample example =new joinexample();
	    joinexample example2 =new joinexample();
	    joinexample example3 =new joinexample();
	    example.start();
        try{
            example.join();
        }catch(Exception e){}
        example2.start();
        example3.start();
	}
}
