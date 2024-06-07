import java.util.*;
public class NextMultipleOfHundred
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(number <= 0)
		{
		    System.out.println("Return = -1");
		}
		else
		{
		    int multipleOf100 = ((number + 100)/100)*100;
		    
		    System.out.println("Return = "+multipleOf100);
		}
	}
}