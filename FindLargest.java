public class FindLargest
{
    public static void main(String args[])
    {
	int a = 10, b = 20, c = 30;
	if(a > b && a > c)
	{
	   System.out.println(a+" is biggest.");
	}
	else if(b > c)
        {
           System.out.println(b+" is biggest.");
        }
	else
	{
	   System.out.println(c+" is biggest.");
	}
    }
}