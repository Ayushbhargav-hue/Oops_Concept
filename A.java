//Single Level Inheritance
class A{
 public static void main(String[] args){
		C c=new C();
		c.run();
		c.runn();
	}
}
class B{
	void run(){
		System.out.println("B class is executed");
	}
}
class C extends B{
void runn(){
		System.out.println("C class is executed");
	}
}