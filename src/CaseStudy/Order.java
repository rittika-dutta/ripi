package CaseStudy;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	Customer customer;
	Restaurant restaurant;
	List<MenuItem> items;
	
	public Order(Customer customer, Restaurant restaurant) {
		
		this.customer = customer;
		this.restaurant = restaurant;
		this.items = new ArrayList<>();
	}
	
	public void addItem(String itemName) throws MenuItemNotFoundException, OrderLimitExceededException
	{
		if(items.size()>=5)
		{
			throw new OrderLimitExceededException("More than 5 items not allowed.");
		}
		
		MenuItem item=restaurant.getItem(itemName);
		items.add(item);
		
	}
	
	public void placeOrder()
	{
		if(!customer.isLoggedIn)
		{
			System.out.println("Login is a must to place order.");
			return;
		}
		
		System.out.println("Order placed by "+customer.name+" from"+restaurant.name+":");
		for(MenuItem item:items)
			System.out.println("- "+item.name+" (Rs"+item.price+")");
	}
	
	
	

}
