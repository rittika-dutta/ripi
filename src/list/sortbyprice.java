package list;

import java.util.Comparator;

public class sortbyprice implements Comparator<Book>{
	@Override
	public int compare(Book o1,Book o2)
	{
		return (Double.compare(o1.getPrice(), o2.getPrice()));
	}


}
