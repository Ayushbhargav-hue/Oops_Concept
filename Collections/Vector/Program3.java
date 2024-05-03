import java.util.Vector;
class A{
	public static void main(String args[]){
		Vector<String> vec=new Vector<>();
		
		vec.addElement("ArrayList");
		vec.addElement("LinkedList");
		vec.addElement("Stack");
		vec.trimToSize();
		System.out.println(vec);
	}
}