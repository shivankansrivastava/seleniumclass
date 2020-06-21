package pkg1;

public class Arithmetic2 {

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
		System.out.println("Division is "+c);
		return c;
	}
	public static void main(String[] args) {
		
		Arithmetic2 shiva1=new Arithmetic2();
		int div1=shiva1.div(10, 2);
		int sum1=shiva1.addition(div1, 2);
		int sub1=shiva1.subtraction(sum1, 2);
		int sub2=shiva1.subtraction(sub1, 2);
		int Mul1=shiva1.mul(sub2, 2);
	}
}
	
