import java.util.*;
public class MultiplyDigit 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		multiplyDigit(number);
		
		sc.close();
		
	}
	static void multiplyDigit(int number)
	{
		int multiply = 1;
		while(number != 0)
		{
		  int r = number % 10;
		  multiply = multiply * r;
		  number = number / 10;
		}
		System.out.println("Multiplication of digits: "+multiply);
	}

}
