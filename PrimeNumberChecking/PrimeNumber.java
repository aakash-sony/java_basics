public class PrimeNumber
{
    int number, i;
    public void checkPrime()
    {
       for(i = 2; i <= number; i++)
       {
	   if(number % i == 0)
	   {
		break;
	   }
       }
	if(number == i)
	{
	   System.out.println("Given number is Prime number.");
	}
	else
	{
	  System.out.println("Given number is not a Prime number.");
	}
    }
}