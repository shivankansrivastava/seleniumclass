package pkg1;

public class Thiskey 
{
	public static void main(String[] args) 
	{
		Thiskey shiva= new Thiskey();
		shiva.Thiskeytwo(2, 1.4f);
		
		}
	
	public void Thiskeydefault() 
	{
		this.Thiskeythree(1, 2, 3.4f);
		System.out.println("Default method");
		
		}
	
	public void Thiskeyone(int a) 
	{
		this.Thiskeydefault();
		System.out.println("1 parameterized method");
		
		}
	
	public void Thiskeytwo(int a, float b) 
	{
		this.Thiskeyfour(1, 2, 2.4f, 4);
		System.out.println("2 parameterized method");
		
		}
	
	public void Thiskeythree(int a, int b, float c) 
	{
		System.out.println("3 parameterized method");
		
		}
	
	public void Thiskeyfour(int a, int b, float c, int d) 
	{
		this.Thiskeyone(5);
		System.out.println("4 parameterized method");
		
		}

}
