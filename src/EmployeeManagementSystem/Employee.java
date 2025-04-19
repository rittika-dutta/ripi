package EmployeeManagementSystem;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private String name;
	private int id;
	private double salary;
	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return getName()+" "+getId()+" "+getSalary();
	}

	public boolean equals(Object obj) 
	{
		Employee emp=(Employee)obj;
		return this.name.equals(emp.name)&&this.id==emp.id && this.salary==emp.salary;
	}

	public int hashCode()
	{
		return Objects.hash(this.name,this.id,this.salary);
	}
	
	public int compareTo(Employee o)
	{
		return this.id-o.id;
	}

}

