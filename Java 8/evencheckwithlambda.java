import java.util.Scanner;
interface A {
        boolean check(int num);
    }
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		A user=b->b%2==0;
		if(user.check(c))System.out.println("Even");
		else System.out.println("Odd");
		}
		
		
}
