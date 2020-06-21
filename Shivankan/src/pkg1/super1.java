package pkg1;

public class super1 
{
	public super1()
	{
		this(1, 2);
		System.out.println("Parent default constructor");
	}
	
	public super1(int a)
	{
		this(1, 2, 3);
		System.out.println("Parent 1 parameterized constructor");
	}
	
	public super1(int a, int b)
	{
		this(1);
		System.out.println("Parent 2 parameterized constructor");
	}
	
	public super1(int a, int b, int c)
	{
		System.out.println("Parent 3 parameterized constructor");
	}

}
