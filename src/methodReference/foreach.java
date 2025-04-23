package methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class foreach {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,6,2,8,9);
//		list.forEach(s->System.out.println(s));
		
//		list.sort(null);
//		
//		list.forEach(System.out::println);
		
//		Collections.sort(list);
//		list.forEach(s->System.out.println(s));
		
		Integer arr[]=list.toArray(Integer[]::new);
		System.out.println(arr.length);
		
	}

}
