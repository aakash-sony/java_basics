//Palindrome String
import java.util.*;
class NonRepeatedCharString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if(isNonRepeated(str))
		{
			System.out.println("Non repeated characters.");
		}
		else
		{
			System.out.println("repeated characters.");
		}
		
	}
	
	public static boolean isNonRepeated(String str)
	{
		int length = str.length();
		for(int i = 0; i < length; i++)
		{
			for(int j = i + 1; j < length; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
}