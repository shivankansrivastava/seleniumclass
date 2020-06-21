package logics;

import java.util.Scanner;

public class swap2 
{
	public void swapwothird(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
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
		
		swap2 swa=new swap2();
		swa.swapwothird(a, b);
		
	}

}
