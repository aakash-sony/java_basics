class Super
{
	public Super show()
	{
		System.out.println("Show method of super class");
		return this;
	}
}
class Sub extends Super
{
	@Override
	public Sub show()
	{
		System.out.println("Show method of sub class");
		return this;
	}
}

public class CoVariant 
{
	public static void main(String[] args) 
	{
		Super s = new Sub();
		s.show();
	}
}