class A{
public static void main(String[] args){
	D d=new D();
	d.run();
	d.run2();
	d.run3();
}
}
class B {
	void run(){
		System.out.println("B class is running");
	}
}
class C extends B{
	void run2(){
		System.out.println("C class is running");
	}
}
class D extends C{
	void run3(){
		System.out.println("D class is running");
	}
}