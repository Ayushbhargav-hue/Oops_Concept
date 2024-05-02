import java.util.ArrayList;
import java.util.Collections;
class A{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<>();
		list.add("Bhopal");
		list.add("Indore");
		list.add("Raipur");
		list.add("Gurgaon");
		System.out.println("List elements before applying reverse method : "+list);
		Collections.reverse(list);
		System.out.println("List elements after applying reverse method : "+list);
	}
}