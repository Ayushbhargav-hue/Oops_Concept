import java.util.HashMap;
public class A
{
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Bhopal");
		map.put(2,"Gwalior");
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(6,"Indore");
		map1.put(3,"Raipur");
		map.putAll(map1);
		System.out.println(map);
	}
}
