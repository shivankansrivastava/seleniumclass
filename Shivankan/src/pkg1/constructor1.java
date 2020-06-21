package pkg1;

public class constructor1 {

	public static void main(String[] args) 
	{
		constructor1 shiv= new constructor1();
		constructor1 shiv1= new constructor1(11,12);
		
	}
	
	public constructor1() 
	{
		this(5,8,9);
		System.out.println("default constructor");
		
	}
	
	public constructor1(int a) 
	{
		System.out.println("one parameterized constructor");
	}
	
	public constructor1(int a, int b) 
	{
		this(10);
		System.out.println("two parameterized constructor");
	}
	
	public constructor1(int a, int b, int c) 
	{
		System.out.println("three parameterized constructor");
	}
	
}
