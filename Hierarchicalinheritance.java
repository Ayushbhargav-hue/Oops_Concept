class A{
public static void main(String[] args){
	C c=new C();
	c.parent();
	c.child();
	D d=new D();
	d.parent();
	d.child2();
}
}
class B{
	void parent(){
		System.out.println("Parent is runnning");
	}
}
class C extends B{
	
	void child(){
		System.out.println("Child 1 is running");
	}
}
class D extends B{
	void child2(){
		System.out.println("Child 2 is running");
	}
}