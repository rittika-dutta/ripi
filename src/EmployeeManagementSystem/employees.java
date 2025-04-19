package EmployeeManagementSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class employees {
	static ArrayList<Employee> list_of_emp=new ArrayList<Employee>();
	
	public static void addEmployee(Employee emp)
	{
		list_of_emp.add(emp);
		System.out.println("Employee Added Successfully");
		System.out.println("___________________________");
	}
	
	public static void print()
	{
		for(Employee emp:list_of_emp)
		{
			System.out.println(emp);
		}
//		using iterator
		
//		Iterator<Employee> itr=list_of_emp.iterator();
//		while(itr.hasNext())
//		{
//			Employee emp=itr.next();
//			System.out.println(emp);
//		}
//		
//		//using list iterator
//		ListIterator<Employee> itr2=list_of_emp.listIterator(list_of_emp.size());
//		while(itr2.hasPrevious())
//		{
//			Employee emp=itr2.previous();
//			System.out.println(emp);
//		}
	}
	
	public static boolean searchObject(Employee emp)
	{
		if(list_of_emp.contains(emp))
			return true;
		return false;
	}
	
	public static boolean searchByID(int id)
	{
		Iterator<Employee> itr=list_of_emp.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getId()==id)
				return true;
		}
		
		return false;
	}
	
	public static void removeObject(Employee emp)
	{
		list_of_emp.remove(emp);
		System.out.println("Deleted");
	}
	
	public static void removebyID(int id)
	{
		Iterator<Employee> itr=list_of_emp.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getId()==id)
				itr.remove();
		}
	}
	
	public static void updatebyID(int id,Scanner m)
	{
		Employee old=null;
		for(Employee employee: list_of_emp)
		{
			if(employee.getId()==id)
				old=employee;
		}
		System.out.println("Enter name, salary to update");
		old.setName(m.next());
		old.setSalary(m.nextDouble());
		old.setId(m.nextInt());
		System.out.println("UPDATED!!!");
	}
	
	public static void sort()
	{
		Collections.sort(list_of_emp);
		System.out.println("Employees are sorted.");
	}
	
	
}
