import java.util.*;
public class Printing1toNPerfectNumber
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	printingPerfectNumber(num);	
     }

      static void printingPerfectNumber(int number)
      {
          for(int i = 1; i <= number; i++)
	  {
		int sum = 0;
	      for(int j = 1; j < i; j++)
	      {
		 if(i % j == 0)
	         {
		   sum = sum + j;
	         }
              }
	     if(i == sum)
             {
	        System.out.println(i);
             }
	  }
	
      }
}


