package list;
import java.util.PriorityQueue;
public class priorityQueue {
	public static void main(String[] args) {
		sortbyprice s=new sortbyprice();
		PriorityQueue<Book> p=new PriorityQueue<Book>(s);
		p.add(new Book(123,"HP",123.45));
		p.add(new Book(234,"PJ",234.56));
		p.add(new Book(345,"SH",345.67));
		
		while(!p.isEmpty())
		{
			System.out.println(p.poll());
		}
	}

}
