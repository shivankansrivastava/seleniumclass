package logics;

import java.util.Scanner;

public class prime 
{
	public void primenum(int a)
	{

		if(a%a==0 && a%2!=0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter first number");
		Scanner  s=new Scanner(System.in);
		int a= s.nextInt();
		
		prime pri= new prime();
		pri.primenum(a);
		
		
	}

}
