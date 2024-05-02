import java.util.LinkedList;
import java.util.Collections;
class A{
	public static void main(String args[]){
		LinkedList<String> li=new LinkedList<>();
		li.add("Madhya Pradesh");
		li.add("Bihar");
		li.add("Rajasthan");
		li.add("Uttar Pradesh");
		System.out.println("Before using reverse method :"+li);
		Collections.reverse(li);
		System.out.println("After using reverse method :"+li);
	}

}