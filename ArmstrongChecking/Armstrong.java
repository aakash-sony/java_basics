import java.lang.*;
public class Armstrong
{
    public void checkArmstrong(int number)
   {
     int temp = number;
     int count = 0;
     double sum = 0;

      do
      {
         count++;
         number = number / 10;  
        
      }while(number!=0);
       number = temp;
       while(temp!=0)
        {
           int r = temp % 10;
           sum = sum + Math.pow(r, count); 
           temp = temp / 10;          
        }
       if(number == sum)
       {
          System.out.println("Number is armstrong.");
       }
       else
      {
         System.out.println("Number is not a Armstrong.");
      }
        
    }
}