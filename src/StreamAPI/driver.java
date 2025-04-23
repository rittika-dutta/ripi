package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
//		for(Employee emps:empList)
//		{
//			System.out.println(emps);
//		}
//		empList.forEach(System.out::println);
		
		
		
//		Map<String,List<Employee>> map=empList.stream().
//				collect(Collectors.groupingBy(Employee::getCity));
//		System.out.println(map);
//		
//		for(String city:map.keySet())
//		{
//			System.out.println(city+"\n"+map.get(city));
//		}
		
		
		
//		Map<Integer,List<Employee>> map=empList.stream().
//				collect(Collectors.groupingBy(Employee::getAge));
//		for(int age:map.keySet())
//			{
//				System.out.println(age+"\n"+map.get(age));
//			}

		
		
//		Map<String,List<Employee>> map=empList.stream().
//				collect(Collectors.groupingBy(Employee::getDeptName));
//		for(String deptName:map.keySet())
//			{
//				System.out.println(deptName+"\n"+map.get(deptName));
//			}
		
		
		
//		List<Employee> list=empList.stream().filter(i-> i.getAge()>20).toList();
//		empList.forEach(System.out::println);
		
		
		
//		Employee list=empList.stream().max((e1,e2)->e1.getAge()-e2.getAge()).get();
//		System.out.println(list);
		
		
		Employee list=empList.stream().filter(e->e.getGender()=="F").
				min((e1,e2)->e1.getAge()-e2.getAge()).get();
		System.out.println(list);
	}
	
//	find employees whose age is > 25 and < 30
//	find all employees of hr dept
//	find all emp who live in blore city sort them by their name and print the name of the employees
//	use count() to find total no. of employee in the organization
//	sort employees based on age
//	find the highest experienced employee in the organization
//	find highest salary in the organisation

}
