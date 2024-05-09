

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class JavaStreamDemo {

	public static void main(String[] args) {
		List<A>product=new ArrayList<A>();
		product.add(new A(1,"Oneplus","Nord 3","Oneplus"));
		product.add(new A(2,"Iphone15","15series","Foxconn"));
		product.add(new A(3,"Dell inspiron","14 plus","Dell"));
		product.add(new A(4,"Samsung S12","12 series","Samsung"));
		
		
		List<Integer>list=product.stream()
                           .filter(p->p.pid>2)
                           .map(m->m.pid).
                           collect(Collectors.toList());
		System.out.println(list);
		
		             
		
		

	}

}
class A{
	int pid;
	String productname;
	String modelname;
	String manufactureby;
	public A(int pid, String productname, String modelname, String manufactureby) {
		this.pid = pid;
	    this.productname = productname;
		this.modelname = modelname;
		this.manufactureby = manufactureby;
	}
	
}

