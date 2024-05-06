abstract class example{
	abstract void executed();
}
public class Anonymousclassexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     example ex=new example() {
     void executed() {System.out.println("perfect example");}
	};
     
	ex.executed();
}
}
