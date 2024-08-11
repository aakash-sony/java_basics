import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for checking Palindrome: ");
		int num = sc.nextInt();
		
		if(isPalindrome(num))
		{
			System.out.println(num+" is a Palindrome number.");
		}
		else
		{
			System.out.println(num+" is not a Palindrome number.");
		}	
	}
	
	static boolean isPalindrome(int n)
	{
		int remainder, reverse = 0, temp;
		temp = n;
		while(temp != 0)
		{
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
		}
		return reverse == n;
	}
}