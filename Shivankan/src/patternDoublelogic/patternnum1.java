package patternDoublelogic;

import java.util.Scanner;

public class patternnum1 
{
	public void pattern(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter pattern number");
		Scanner s=new Scanner(System.in);
		int number= s.nextInt();
		patternnum1 p= new patternnum1();
		p.pattern(number);
		}
	}
