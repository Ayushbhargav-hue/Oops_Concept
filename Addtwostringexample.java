import java.util.Scanner;
public class Addtwostringexample
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.concat(s2);
		System.out.print(s1);
		
}
}
