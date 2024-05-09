import java.util.List;

public class Streammfilterexammple {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,5,6,1,2,1);
		list.stream().filter(i->i%2==0).forEach(System.out::println);

	}

}
