package StreamAPI;


import java.util.Arrays;
import java.util.List;

public class demo3 {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","cherry","banana","orange");
//		List<String> res=list.stream().map(i-> i.toUpperCase()).toList();
		String res=list.stream().filter(i-> i.charAt(0)=='a').findFirst().get();
		
		System.out.println(res);
	}

}
