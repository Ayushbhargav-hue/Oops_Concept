import java.util.ArrayList;
class Program1{
    public static void main(String args[]){
ArrayList<String> a1=new ArrayList<>();
a1.add("Practice");
a1.add("Of");
a1.add("ArrayList");
System.out.println(a1);
System.out.println("Element Present in index 1 :"+a1.get(1));
System.out.println("Doees list contains ArrayList? : "+a1.contains("ArrayList"));
a1.add(2,"HashSet");
System.out.println("List after adding item at 2 index :"+a1);
System.out.println("Is arraylist empty? "+a1.isEmpty());
System.out.println("Index of Of is "+a1.indexOf("Of"));
System.out.println("Size of the arraylist is : "+a1.size());
    }
}