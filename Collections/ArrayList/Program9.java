import java.util.ArrayList;
class A{
public static void main(String args[]){
ArrayList<String> arr=new ArrayList<>();
arr.add("Raipur");
arr.add("Bhopal");
arr.add("Indore");
String[] s=new String[arr.size()];
arr.toArray(s);
for(String temp:s)System.out.println(temp);
}
}