class Shape{
	int area(int a) {
		return a*a;
	}
	int area(int l,int b) {
		return l*b;
	}
}
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s=new Shape();
int a=s.area(2);
System.out.println("Area of Square : "+a);
int b=s.area(2,3);
System.out.println("Area of Rectangle : "+b);

	}

}
