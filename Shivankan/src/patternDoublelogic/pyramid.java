package patternDoublelogic;

import java.util.Scanner;

public class pyramid 
{
	public void pattern(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=-i;k<i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter pattern number");
		Scanner s=new Scanner(System.in);
		int number= s.nextInt();
		pyramid p= new pyramid();
		p.pattern(number);
		}
}
