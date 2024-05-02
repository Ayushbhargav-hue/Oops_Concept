import java.util.LinkedList;
import java.util.Iterator;
class A{
	public static void main(String args[]){
		LinkedList<String> li=new LinkedList<>();
		li.add("Madhya Pradesh");
		li.add("Bihar");
		li.add("Rajasthan");
		li.add("Uttar Pradesh");
		Iterator<String> itr=li.iterator();
        while(itr.hasNext()){
           System.out.println(itr.next());
        }
	}
}