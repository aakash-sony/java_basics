//Palindrome String
import java.util.*;
class CountingVowelConsonant
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		countingVowelConsonant(str);	
	}
	
	public static void countingVowelConsonant(String str)
	{
		int length = str.length();
		int countV = 0;
		int countC = 0;
		for(int i = 0; i < length; i++)
		{
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
			  if(str.charAt(i) == 'a' || str.charAt(i) =='A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U')
			  {
					countV++;
			  }
			  else
			  {
				   countC++;
			  }
			}
		}
		   System.out.println("Vowel count = "+countV+" "+"Consonant count = "+countC);
	}
}