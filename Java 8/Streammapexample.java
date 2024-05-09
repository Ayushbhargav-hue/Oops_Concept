import java.util.Arrays;
import java.util.List;
public class Streammapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=Arrays.asList(2,4,6,8,9);
list.stream().map(i->i*i).forEach(System.out::println);
	}

}
