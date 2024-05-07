import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class comparatorwithlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(3);
       list.add(72);
       list.add(16);
       Collections.sort(list,(a,b)->b-a);
       System.out.println(list);
       Collections.sort(list,(a,b)->a-b);
       System.out.println(list);
	}

}
