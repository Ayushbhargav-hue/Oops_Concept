//example of abstract method and class
abstract class Subject{
abstract void books();
}
class Dsa extends Subject{
    void books(){
        System.out.println("Dsa books");
    }
}
public class Os extends Subject
{
    void books(){
        System.out.println("OS books");
    }
	public static void main(String[] args) {
		Dsa st=new Dsa();
		st.books();
		Os st1=new Os();
		st1.books();
	}
}
