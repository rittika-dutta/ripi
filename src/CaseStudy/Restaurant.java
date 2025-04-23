package CaseStudy;

import java.util.HashMap;
import java.util.Map;

public class Restaurant 
{
	String name;
	Map<String, MenuItem> menu;
	
	public Restaurant(String name) 
	{
		
		this.name = name;
		this.menu = new HashMap<>();
	}
	
	public void addItem(MenuItem item)
	{
		menu.put(item.name.toLowerCase(),item);
	}
	
	public MenuItem getItem(String name) throws MenuItemNotFoundException
	{
		MenuItem item=menu.get(name.toLowerCase());
		if(item==null)
			throw new MenuItemNotFoundException("Item ' "+name+" ' not found in menu.");
		
		return item;
	}
	
	
	
	

}
