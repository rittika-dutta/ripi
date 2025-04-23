package CaseStudy;

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		Restaurant r=new Restaurant("Food Delivery");
		r.addItem(new MenuItem("Dosa", 40.00));
		r.addItem(new MenuItem("Idli", 25.00));
		r.addItem(new MenuItem("Vada", 20.00));
		
		Customer c=new Customer("riii");
		c.login();
		
		Order order=new Order(c,r);
		
		try
		{
			while(order.items.size()<=5) {
				order.addItem(m.next());
				
				
			}
		}
		catch(OrderLimitExceededException | MenuItemNotFoundException E) {
			System.out.println(E.getMessage());
		}
		
	}

}
