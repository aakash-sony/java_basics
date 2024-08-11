import java.util.Scanner;
public class ExtractDigits
{
     public static void main(String args[])
     {
	 int temp, count = 0;
         Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int num = sc.nextInt();
	
	temp = num;
	while(temp != 0)
	{
	   temp = temp / 10;
	   count++;
	}
	temp = num;
	while(temp != 0)
	{
	   int r = temp % 10;
	   System.out.println(r + " is at position "+count);
	   temp = temp / 10;
	   count--;
	}
     }
}