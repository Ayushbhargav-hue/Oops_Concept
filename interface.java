

interface RBI{
	void Loan();
}
class hdfc implements RBI{
	public void Loan() {
		System.out.println("Loan verfied by Hdfc");
	}
}
public class bankofindia implements RBI{
public void Loan(){
	System.out.println("Loan Verified by Boi");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
bankofindia user1=new bankofindia();
user1.Loan();
hdfc user2=new hdfc();
user2.Loan();
	}

}
