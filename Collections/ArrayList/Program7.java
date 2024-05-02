import java.util.ArrayList;
import java.util.Collections;
class A{
	public static void main(String args[]){ 
	ArrayList<String> list=new ArrayList<>();
		list.add("CSK");
		list.add("MI");
		list.add("RCB");
		list.add("RR");
		list.add("SRH");
		System.out.println("Before swap list : "+list);
		Collections.swap(list,1,2);
		System.out.println("After swap list : "+list);
}
}
