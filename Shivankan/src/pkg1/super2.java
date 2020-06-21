package pkg1;

public class super2 extends super1
{
	public super2()
	{
		super();
		System.out.println("Child default constructor");
	}
	
	public super2(int a)
	{
        this(1, 2, 3);
		System.out.println("Child 1 parameterized constructor");
	}
	
	public super2(int a, int b)
	{
		this(1);
		System.out.println("Child 2 parameterized constructor");
	}
	
	public super2(int a, int b, int c)
	{
		this();
		System.out.println("Child 3 parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		super2 s=new super2(1, 2);
	
		
	}

}
