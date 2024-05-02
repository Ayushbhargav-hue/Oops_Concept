import java.util.ArrayList;
import java.util.List;
class A{
	public static void main(String args[]){
		ArrayList<String> arr=new ArrayList<>();
		List<String> list=new ArrayList<>();
		arr.add("Monday");
		arr.add("Sunday");
		arr.add("Saturday");
		list.add("Tuesday");
		list.add("Monday");
		System.out.println("Does arraylist contains all elements in list : "+arr.containsAll(list));
		
	}
}