class A{
public static void main(String[] args){
	Vehicle user1 = new Vehicle();
        user1.setname("shine");
        user1.settype(2);
        System.out.println("User 1 Name: " + user1.getname());
        System.out.println("User 1 Type: " + user1.gettype());

        System.out.println("Now User 2");
        Vehicle user2 = new Vehicle();
        user2.setname("Thar");
        user2.settype(1);
        System.out.println("User 2 Name: " + user2.getname());
        System.out.println("User 2 Type: " + user2.gettype());
    }
}
class Vehicle{
	private String name;
	private int type;
	public String getname(){
		return name;
	} 
	public void setname(String name){
		this.name=name;
	}
	public int gettype(){
		return type;
	}
	public void settype(int type){
		if(type==2||type==4||type==3)this.type=type;
		else System.out.println("Invalid Type of vehicle");
	}
	
}