import java.util.*;
public class FindPerfectNumber
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	findPerfectNumber(num);	
     }

      static void findPerfectNumber(int number)
      {
	 int sum = 0;
          for(int i = 1; i < number; i++)
	  {
	      if(number % i == 0)
	      {
		 sum = sum + i;
	      }
	  }
	 if(number == sum)
         {
	   System.out.println("Number is a Perfect number.");
         }
	 else
         {
	   System.out.println("Number is not a Perfect number.");
         }
      }
}


