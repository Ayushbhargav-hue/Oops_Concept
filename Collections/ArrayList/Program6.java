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
		System.out.println("Orginal list : "+list);
		Collections.shuffle(list);
		System.out.println("Result after shuffle : "+list);
		Collections.shuffle(list);
		System.out.println("Result after shuffle 2 : "+list);
	}
}