import java.util.Vector;
class A{
	public static void main(String args[]){
		Vector<String> vec=new Vector<>();
		System.out.println("Is this vector is empty : "+vec.isEmpty());
		vec.addElement("ArrayList");
		vec.addElement("LinkedList");
		vec.addElement("Stack");
		System.out.println(vec.removeAll(vec));
	}
}