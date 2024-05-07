interface A {
        boolean check(int num);
    }
public class Main
{
	public static void main(String[] args) {
		A user=b->b%2==0;
		System.out.println(user.check(4));
		System.out.println(user.check(9));
		}
		
		
}
