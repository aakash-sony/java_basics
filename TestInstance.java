public class TestInstance
{
	public static void main(String [] args)
	{
		String s = "india";

		if(s instanceof String)
		{
			System.out.println("s is pointing to String Object");
		}

		Integer i = 45;

        if(i instanceof Number)
		{
			System.out.println("i is pointing to Number Object");
		}

		if(i instanceof Object)
		{
			System.out.println("i is pointing to Object");
		}

	}
}