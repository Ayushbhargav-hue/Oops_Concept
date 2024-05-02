import java.util.ArrayList;
class Program4{
	public static void main(String args[]){
		ArrayList<String> arr=new ArrayList<>();
		arr.add("First");
arr.add("Second");
arr.add("Third");
arr.add("Random");
System.out.println("Original arraylist : "+arr);
arr.clear();
System.out.println("Afer clear arraylist : "+arr);
	}
}