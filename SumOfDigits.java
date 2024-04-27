/*
Q) Write a Java program and compute the sum of a two digit integer number
    Example :- Input = 54
           Output = 9
*/
public class SumOfDigits
{
    public static void main(String args[])
   {
	int num = Integer.parseInt(args[0]);
        int sum = 0;
        
        while(num!=0)
        {
           int remainder = num % 10;
           sum = sum + remainder;
           num = num / 10; 
        }
         System.out.println("Sum is: "+sum);

    }

}