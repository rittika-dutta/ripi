package CaseStudy;

public class Customer {
	String name;
	boolean isLoggedIn;
	
	public Customer(String name)
	{
		this.name=name;
		this.isLoggedIn=false;
	}
	
	public void login()
	{
		this.isLoggedIn=true;
	}

}
