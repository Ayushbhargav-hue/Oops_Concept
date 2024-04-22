public class ensurecapacitysbuilderexample
{
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		s.append("C++");
		System.out.println(s.capacity());
		s.append("Java is platform independent");
		System.out.println(s.capacity());
		
		s.ensureCapacity(10);
		System.out.println(s.capacity());
		s.ensureCapacity(56);
		System.out.println(s.capacity());
	}
}
