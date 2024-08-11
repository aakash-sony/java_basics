abstract class Animal
{
	public abstract void roam();
}

public class AnonymousWithAbstract {

	public static void main(String[] args) 
	{
		Animal bird = new Animal()
		{
			@Override
			public void roam() 
			{
				System.out.println("Bird is roaming");				
			}
			
		};
		
		Animal lion = new Animal()
		{
			@Override
			public void roam() 
			{
				System.out.println("Lion is roaming");				
			}
			
		};
		
		bird.roam();  lion.roam();

	}

}