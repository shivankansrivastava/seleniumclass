package pkg1;

public class Student {

	int age;
	int roll_num;
	
	public void Method1()
	{
		System.out.println("Welcome all");
	}
	
	public void Method2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student Deepak= new Student();
		Deepak.age=25;
		System.out.println("My age is "+ Deepak.age);
		Deepak.roll_num=55;
		System.out.println("My roll number is "+ Deepak.roll_num);
		Deepak.Method1();
		Deepak.Method2();
	}
}
