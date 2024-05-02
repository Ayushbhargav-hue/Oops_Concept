import java.util.LinkedList;
import java.util.ArrayList;
class A{
	public static void main(String args[]){
		LinkedList<String> li=new LinkedList<>();
		li.add("Madhya Pradesh");
		li.add("Bihar");
		li.add("Rajasthan");
		li.add("Uttar Pradesh");
		System.out.println("Actual LinkedList :"+li);
		List<String> list=new ArrayList<>();
		list.add("Bihar");
		list.add("Himachal Pradesh");
		list.add("Punjab");
		li.addAll(list);
		System.out.println("After addAll method  :"+li);
	}

}