package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class array {
	public static void main(String[] args) {
		ArrayList<Double> list=List.of(2.1,2.20,3.43,4.89,5.78);
		Collections.sort(list,(s1,s2)->Double.compare(s1, s2));
		list.forEach(t->System.out.println(t+" "));
		
	}

}
