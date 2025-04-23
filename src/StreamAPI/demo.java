package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,8,3,7,2,9);
		
		List<Integer> even=new ArrayList<Integer>();
//		for(Integer i:list)
//		{
//			if(i%2==0)
//				even.add(i);
//		}
//		System.out.println(even);
		
		List<Integer> res=list.stream().filter(i-> i%2==0).toList();
		System.out.println(res);
	}

}
