public class PassByValueLab 
{
	public static void main(String[] args) 
	{
		 String name = "NIT";
		 modifyName(name);
		 System.out.println(name);
	}
	
	public static void modifyName(String name)
	{
		name = "Hyd";
		
	}
	
}