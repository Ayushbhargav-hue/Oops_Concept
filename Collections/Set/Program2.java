import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
class {
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
str.addAll(arr);
System.out.println(str);
}
}
