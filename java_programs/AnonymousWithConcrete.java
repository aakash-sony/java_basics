
class Super
{
	public void show()
	{
		System.out.println("show method of super class");
	}
}

public class AnonymousWithConcrete 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class (class without any name)
		Super sub = new Super()
		{
			@Override
			public void show()
			{
				System.out.println("Show method of sub class");
			}
		};
		
		sub.show();

	}

}