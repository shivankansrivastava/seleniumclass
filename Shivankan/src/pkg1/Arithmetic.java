package pkg1;

public class Arithmetic {
	
	public int addition(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition is "+c);
		return c;
		
	}
	
	public int subtraction(int a, int b)
	{
		int c= a-b;
		System.out.println("Subtraction is "+ c);
		return c;
	}
	
	public int mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication is "+c);
		return c;
	}
	
	public int div(int a, int b)
	{
		int c=a/b;
		System.out.println("Final value "+c);
		return c;
	
	}
	
	public static void main(String[] args) 
	{
		Arithmetic shiva=new Arithmetic();
		int sum1=shiva.addition(10, 2);
		int sum2=shiva.addition(sum1, 2);
		int sub1=shiva.subtraction(sum2, 2);
		int mul1= shiva.mul(sub1, 2);
		int final_value=shiva.div(mul1, 2);
		
	}

}
