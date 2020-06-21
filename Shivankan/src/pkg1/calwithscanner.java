package pkg1;

import java.util.Scanner;

public class calwithscanner 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Please first value");
		Scanner shivascan=new Scanner(System.in);
		int a=shivascan.nextInt();
		System.out.println("Please second value");
		int b=shivascan.nextInt();
		calwithscanner shiva=new calwithscanner();
		int sum1=shiva.add(a, b);
		System.out.println("Please what value you want to minus");
		int c=shivascan.nextInt();
		int sub1=shiva.sub(sum1, c);
		System.out.println("Please what value you want to add now");
		int d=shivascan.nextInt();
		int sum2=shiva.add(sub1, d);
		System.out.println("Please enter any value to multiply");
		int e=shivascan.nextInt();
		int mul=shiva.mult(sum2, e);
		System.out.println("Please enter any value to divide & get final value");
		int f=shivascan.nextInt();
		int finalvalue=shiva.div(mul, f);
		
		}
	
	public int add(int a, int b)
	{
	
		int c=a+b;
		System.out.println("Addition is "+c);
		return c;
	}
	
	public int sub(int a, int b)
	
	{
		int c=a-b;
		System.out.println("Substraction is "+c);
		return c;
		
	}
	
	public int mult(int a, int b)
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

}
