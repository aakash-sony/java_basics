   enum Season   
	{
	   SPRING("Pleasant"), SUMMER("UnPleasent"), RAINY("Rain"), WINTER;

        String msg;
	  
	    private Season(String msg)
		{
		  this.msg = msg;
		}

		private Season()
		{
			this.msg = "Cold";
		}

		public String getMessage()
		{
			return msg;
		}
	}
class Enum4
{	
	public static void main(String[] args) 
	{
		Season s1[] = Season.values();

		for(Season x : s1)
			System.out.println(x+"  is :"+x.getMessage());
	}
}