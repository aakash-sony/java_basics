import java.util.Scanner;
class DigitCount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number for counting the Digits: ");
		int num = sc.nextInt();
		
		System.out.println(num+" is a "+getDigitsCount(num)+" digit number.");
	}
	
	static int getDigitsCount(int number)
	{
		int count = 0;
		do
		{
		   number = number / 10;
		   count++;
	    }while(number != 0);
		
		return count;
	}	

}