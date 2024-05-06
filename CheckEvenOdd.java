import java.util.*;

public class CheckEvenOdd
{
	public static void main(String args[])
       {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int number = sc.nextInt();
	  numberChecking(number);
       }
	static void numberChecking(int num)
       {
	  if(num % 2 == 0)
	  {
	    System.out.println(num+" is a even number.");		
          }
	  else
	 {
	   System.out.println(num+" is a odd number.");
	 }
       }

}