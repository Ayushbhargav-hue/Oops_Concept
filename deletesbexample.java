//delete from string ilusing string builder method
public class deletesbexample
{
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("railhfdworld");
		s.delete(4,7);
		System.out.println(s);
	}
}
