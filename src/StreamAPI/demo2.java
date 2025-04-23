package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo2 {
	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(1,7,3,2,7,2,9);
//		List<Integer> res=list.stream().skip(2).toList();
//		List<Integer> res=list.stream().limit(2).toList();
//		List<Integer> res=list.stream().sorted().toList();
//		List<Integer> res=list.stream().sorted(Comparator.reverseOrder()).toList();
//		List<Integer> res=list.stream().sorted().distinct().toList();
//		List<Integer> res=list.stream().filter(i-> i%2==0).toList();
//		List<Integer> res=list.stream().map(i-> i*2).toList();
//		int first=list.stream().findFirst().get();
		
//		int min=list.stream().min(Integer::compare).get();
//		int max=list.stream().max(Integer::compare).get();
//		List<String> res=list.stream().map(i-> i+"hi").toList();
		
//		List<String> list=Arrays.asList("chipi","chapa","rubi","dubi","raba","daba");
//		List<String> res=list.stream().filter(i-> i.charAt(0)=='c').toList();
//		List<String> res=list.stream().filter(i-> i.length()>4).toList();
		
		List<String> list=Arrays.asList("chipi","chapa","rubi","dubi","raba","daba");
		Map<Integer,List<String>> map=list.stream().
				collect(Collectors.groupingBy(String::length));
		
//		Map<Object,Long> map=list.stream().
//				collect(Collectors.groupingBy(i-> i.charAt(0),Collectors.counting()));
		
		System.out.println(map);
	}

}
