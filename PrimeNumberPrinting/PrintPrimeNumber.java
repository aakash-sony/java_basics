public class PrintPrimeNumber
{
    int lastNumber;  
    public void printingPrime()
   {
     int i, j; 
      for(i = 1; i <= lastNumber; i++)
      {
	  for(j = 2; j < i; j++)
          {
	     if(i % j == 0)
             {
		break;
             }
          }
	  if(i == j)
	  {
             System.out.println(i);
	  }
      }
   }
}