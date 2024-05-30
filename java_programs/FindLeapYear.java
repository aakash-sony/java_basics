import java.util.Scanner;
class FindLeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year for checking the leap year: ");
		int year = sc.nextInt();
		
		if(isLeapYear(year))
		{
			System.out.println(year+" is a leap year.");
		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}
	}
	
	static boolean isLeapYear(int year)
	{
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}