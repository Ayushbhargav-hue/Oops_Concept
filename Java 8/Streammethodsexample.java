import java.util.Arrays;
import java.util.List;


public class Streammethodsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,4,6,8,9);
		System.out.println("Use of Sorted method in Stream API");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Use of min method in Stream API");
		Integer integer=list.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(integer);
		System.out.println("Use of max method in Stream API");
		Integer integer1=list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(integer1);
	}

}
