package generics;
import java.util.Set;
import java.util.HashSet;
public class driver {
	public static void main(String[] args) {
		Set<Student> list=new HashSet<>();
		
		Student s1=new Student(4,"abcc",75.45);
		Student s2=new Student(12,"abc",70.78);
		Student s3=new Student(12,"abc",70.78);
		
		list.add(s1);
		list.add(s2);
		
		System.out.println(list);
		
		
	}

}
