//Palindrome String
import java.util.*;
class PalindromeString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if(isPalindrome(str))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		int length = str.length();
		for(int i = 0; i < length / 2; i++)
		{
		  if(Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(str.charAt(length - 1 - i)))
		  {
				return false;
		  }
		}
		return true;
	}
}