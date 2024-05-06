import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
class A{
public static void main(String args[]){
	Set<String> str=new HashSet<>();
str.add("Bhopal");
str.add("Indore");
str.add("Gwalior");
str.add("Bhopal");
str.add("Guna");
ArrayList<String> arr=new ArrayList<>();
arr.add("Indore");
arr.add("Raisen");
arr.add("Sehore");
str.retainAll(arr);
System.out.println(str);
}
}
