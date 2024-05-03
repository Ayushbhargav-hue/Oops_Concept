import java.util.LinkedList;
import java.util.ArrayList;
class A{
	public static void main(String args[]){
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Python");
		arr.add("C");
		arr.add("C++");
		arr.add("Java");
		LinkedList<String> list=new LinkedList<>();
		list.add("C++");
		list.add("C");
		list.add("Python");
		System.out.println("Whether LinkedList Contains all elements as ArrayList or not : "+list.containsAll(arr));
	}
}
