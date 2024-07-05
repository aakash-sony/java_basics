enum Season
{
	WINTER, SUMMER, SPRING, RAINY;   //All are object of type enum

	 
	private Season()
	{
		System.out.println("Constructor is executed....");
	}	
}
class Enum5 
{
	public static void main(String[] args) 
	{
		System.out.println(Season.WINTER);
		System.out.println(Season.SUMMER);
		
	}
}