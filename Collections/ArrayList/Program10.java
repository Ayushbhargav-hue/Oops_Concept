import java.util.ArrayList;
import java.util.List;
class A{
public static void main(String args[]){
ArrayList<String> arr=new ArrayList<>();
arr.add("Raipur");
arr.add("Bhopal");
arr.add("Indore");
List<String> list=arr.subList(0,1);
System.out.println("ArrayList Elements : "+arr);
System.out.println("List Elements : "+list);
}
}