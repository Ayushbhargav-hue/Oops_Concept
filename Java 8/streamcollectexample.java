import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamcollectexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,4,6,8,9);
		List<Integer> list1=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(list1);
	}

}
