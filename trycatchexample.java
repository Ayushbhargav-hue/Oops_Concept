public class trycatchexample
{
	public static void main(String[] args) {
		try{
		    int a=100/0;
		 System.out.println("Try block executed");
		}catch(Exception e){
		    System.out.println("Exception block executed");
		}
		finally{
		    System.out.println("Finally block executed");
		}
	}
}
