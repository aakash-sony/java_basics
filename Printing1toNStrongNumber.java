import java.util.Scanner;
public class Printing1toNStrongNumber
{
     public static void main(String args[])
     {
	Printing1toNStrongNumber s = new Printing1toNStrongNumber();

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	s.printingStrongNumber(num);	
     } 
     public void printingStrongNumber(int number)
     {
	for(int i = 1; i <= number; i++)
	{
	    int temp = i;
	   
	    int sum = 0;

	    while(temp != 0)
           {
	       int fact = 1;
	       int r = temp % 10;
	       while(r != 0)
              {
	         fact = fact * r;
	         r--;
              }
	      sum = sum + fact;
              temp = temp / 10;
           }
	   if(i == sum)
	   {
	      System.out.println(i);
	   }
	}
	
      }
}