package set;
import java.util.Set;
import java.util.LinkedHashSet;
public class linkedhashset {
	public static void main(String[] args) {
		Set<Integer> list=new LinkedHashSet<Integer>();
		
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
	}

}
