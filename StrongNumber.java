import java.util.Scanner;
public class StrongNumber
{
     public static void main(String args[])
     {
	StrongNumber s = new StrongNumber();

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	s.checkingStrongNumber(num);	
     } 
     public void checkingStrongNumber(int number)
     {
	int temp = number;
	int fact = 1;
	int sum = 0;
	while(number != 0)
        {
	   int r = number % 10;
	   while(r != 0)
          {
	     fact = fact * r;
	      r--;
          }
	  sum = sum + fact;
	  fact = 1;
          number = number / 10;
        }
	if(temp == sum)
	{
	  System.out.println("This number is a Strong number.");
	}
	else
	{
	   System.out.println("This number is not a strong number.");
	}
     }
}