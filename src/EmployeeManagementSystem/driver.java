package EmployeeManagementSystem;

import java.util.Scanner;

public class driver {
	
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Welcome to the Employee Management System");
		while(true)
		{
		System.out.println("1. Add Employee\n2. Print all employee\n3. Search Employee by name\n4. Search Employee by ID\n5. Delete Employee\n6. Delete Employee by ID\n7. update employee by ID\n8 sort employee based on ID");
		int ch=m.nextInt();
		
		
		switch(ch)
		{
		case 1 : {
			Employee emp=createEmployeeObject(m);
			employees.addEmployee(emp);
			break;
		}
		
		case 2 : {
			employees.print();
			System.out.println("----------------------------");
			break;
		}
		
		case 3 : {
			Employee emp=createEmployeeObject(m);
			boolean result=employees.searchObject(emp);
			System.out.println(result);
			break;
		}
		
		case 4 : {
			System.out.println("Enter ID to search");
			int id=m.nextInt();
			if(employees.searchByID(id))
				System.out.println(id+" is present");
			else
				System.out.println(id+" not present");
			System.out.println("-------------");
			break;
		}
		
		case 5 : {
			Employee emp=createEmployeeObject(m);
			employees.removeObject(emp);
			employees.print();
			System.out.println("------------");
			break;
			
		}
		
		case 6 : {
			System.out.println("Enter id to delete");
			int id=m.nextInt();
			employees.removebyID(id);
			employees.print();
			System.out.println("---------");
			break;
		}
		
		case 7 : {
			System.out.println("Enter id to update");
			int id=m.nextInt();
			boolean res=employees.searchByID(id);
			if(res)
			{
			employees.updatebyID(id, m);
			}
			else
				System.out.println("Employee not found");
			System.out.println("---------");
			break;
		}
		
		case 8 : {
			employees.sort();
			employees.print();
			break;
		}
		
		default: System.exit(0);
		
		}
		
	}
		
		 
		
	}
	private static Employee createEmployeeObject(Scanner m)
	{
		System.out.println("Enter ID , name, salary");
		Employee emp=new Employee(m.nextInt(),m.next(), m.nextDouble());
		return emp;
	}
	
	

}
