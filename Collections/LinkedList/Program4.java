import java.util.LinkedList;

class A{
	public static void main(String args[]){
		LinkedList<String> li=new LinkedList<>();
		li.add("Madhya Pradesh");
		li.add("Bihar");
		li.add("Rajasthan");
		li.add("Uttar Pradesh");
		System.out.println("Before using clear method :"+li);
		li.clear();
		System.out.println("After using clear method :"+li);
	}

}