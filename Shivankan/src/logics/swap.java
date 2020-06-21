package logics;

import java.util.Scanner;

public class swap 
{
	int c;
	
	public void swap1(int a, int b)
	{
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a after swapping "+a);
		System.out.println("Value of b after swapping "+b);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter first number");
		Scanner  s=new Scanner(System.in);
		int a= s.nextInt();
		System.out.println("Please enter second number");
		int b= s.nextInt();
		
		swap sw=new swap();
		sw.swap1(a, b);
		
		}

}
