import java.util.Scanner;
class CheckingAlphabets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		
		if(isVowel(ch))
		{
			System.out.println(ch+" is vowel.");
		}
		else
		{
			System.out.println(ch+" is consonant.");
		}	
		
	}
	static boolean isVowel(char c)
	{
		switch(c)
		{
			case 'a': case 'A':
			case 'e': case 'E':
			case 'i': case 'I':
			case 'o': case 'O':
			case 'u': case 'U': 
			   return true;
			default: 
     		  return false;		
		}
	}
}