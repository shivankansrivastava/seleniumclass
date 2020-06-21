package patternDoublelogic;

import java.util.Scanner;

public class pattern2 
{
	public void patt(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
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
		pattern2 p= new pattern2();
		p.patt(number);
		}
}
