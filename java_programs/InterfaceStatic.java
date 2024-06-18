interface Drawable
{
	public static void m1()
	{
		System.out.println("m1 static method of interface");
	}
}

public class InterfaceStatic implements Drawable
{
	public static void main(String[] args) 
	{
		 m1();  //Invalid
		InterfaceStatic.m1();  //Invalid
		
		InterfaceStatic is = new InterfaceStatic();
		is.m1();  //Invalid
		
		Drawable.m1();

	}

}