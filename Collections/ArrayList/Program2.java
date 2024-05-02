import java.util.ArrayList;
import java.util.Iterator;
class Program2{
public static void main(String args[]){
ArrayList<String> arr=new ArrayList<>();
arr.add("First");
arr.add("Second");
arr.add("Third");
arr.add("Random");
Iterator<String> itr=arr.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
}
}