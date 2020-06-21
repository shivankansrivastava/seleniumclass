package patternDoublelogic;

import java.util.Scanner;

public class patternnum2 
{
	public void pattern(int a)
	{
		int n=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter pattern number");
		Scanner s=new Scanner(System.in);
		int number= s.nextInt();
		patternnum2 p= new patternnum2();
		p.pattern(number);
		}
}
