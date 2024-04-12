
class Country{
void print() {
		System.out.println("Which country you are from");
	}
}
class India extends Country{
	void print() {
		System.out.println("I am from India");
	}
}
class Nepal extends Country{
	void print() {
		System.out.println("I am from Nepal");
	}
}
public class run {
public static void main(String[] args) {
	Country person1;
	person1=new India();
	person1.print();
	person1=new Nepal();
	person1.print();
}
}
