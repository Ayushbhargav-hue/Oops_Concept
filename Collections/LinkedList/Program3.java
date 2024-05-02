import java.util.LinkedList;

class A{
	public static void main(String args[]){
		LinkedList<String> li=new LinkedList<>();
		li.add("Madhya Pradesh");
		li.add("Bihar");
		li.add("Rajasthan");
		li.add("Uttar Pradesh");
		System.out.println("Before using clone method :"+li);
		li.clone();
		System.out.println("After using clone method :"+li);
	}
}