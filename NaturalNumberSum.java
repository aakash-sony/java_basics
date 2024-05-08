/*
Q) WAP in java to print the sum of first hundred natural number.
*/
public class NaturalNumberSum
{
   public static void main(String args[])
   {
       int sum = 0;
	for(int i = 1; i <= 100; i++)
	{
	    sum = sum + i;
	}
	System.out.println("Sum of first 100 natural number is: "+sum);
   }
}