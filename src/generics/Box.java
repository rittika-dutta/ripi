package generics;

public class Box<T> {
	T num1;
	T num2;
	
	Box(T num1, T num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public void add(T num1, T num2)
	{
		
	}
	
	public static void main(String[] args) {
		Box<Integer> b1=new Box<>(10,20);
		System.out.println(b1.num1+"\t"+b1.num2);
	}

}
