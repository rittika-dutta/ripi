package list;

import java.util.TreeSet;

public class bookDriver {
	public static void main(String[] args) {
		sortbyid id=new sortbyid();
		sortbytitle t=new sortbytitle();
		sortbyprice p=new sortbyprice();
		TreeSet<Book> list=new TreeSet<Book>(t);
		
		Book b1=new Book(123,"HP",123.45);
		Book b2=new Book(234,"PJ",234.56);
		Book b3=new Book(345,"SH",345.67);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println(list);
	}

}
