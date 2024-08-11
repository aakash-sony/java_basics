import java.util.*;
public class CountDigitOfNumber
{
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	countDigit(num);        
     }

     static void countDigit(int number)
     {
	int count = 0;
	do
        {
	   count++;
	   number = number / 10;
        }while(number != 0);
	
	System.out.println("Total digit: "+count);
     }
}