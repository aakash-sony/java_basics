class Bird
{
	protected String name = "Generic Bird";
	
	public String fly()
	{
		return "Generic bird is flying";
	}
}

class Parrot extends Bird
{
	protected String name = "Parrot Bird"; //Variable Shadow
	
	@Override
	public String fly()
	{
		return "Parrot bird is flying";
	}
}

public class VariableShadow 
{
	public static void main(String[] args) 
	{
	   Bird b = new Parrot();
	   System.out.println(b.name+ " :  "+b.fly());
  
	}

}