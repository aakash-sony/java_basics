class Parent
{
	public Parent()
	{
		super();
		System.out.println("No Args of super class");
	}
	public Parent(String str)
	{
		this();
	 System.out.println("Parameterized constructor of super class :"+str);	
	}
}
class Child extends Parent
{
	public Child(String str)
	{
		super(str); 
		System.out.println("Parameterized constructor of sub class");
		
	}
}

public class CallingParameterizedAndCurrentClass 
{
	public static void main(String[] args) 
	{
		new Child("NIT");

	}

}