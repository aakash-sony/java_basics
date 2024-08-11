import java.lang.*;
public class PrintArmstrong
{
    public void printingArmstrong(int number)
   {
      for(int i = 1; i <= number; i++)
      {
	int count = 0;
        double sum = 0;
	int temp = i;
         do
         {
	    count++;
            temp = temp / 10;
         }while(temp != 0);

         temp = i;
         while(temp != 0)
        {
    	   int r = temp % 10;
           sum = sum + Math.pow(r, count);
	   temp = temp / 10;
        }
        if(i == sum)
	{
           System.out.println(i);
        }
      }
   }
}