public class capacitysbuilderexample
{
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		s.append("C++");
		System.out.println(s.capacity());
		s.append("Java is platform independent language");
		System.out.println(s.capacity());
	}
}
