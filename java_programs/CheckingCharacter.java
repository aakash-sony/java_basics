import java.util.Scanner;
class CheckingCharacter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if(isAlphabet(ch))
		{
			System.out.println("Given character is an Alphabet.");
		}
		else
		{
			System.out.println("Given character is not an Alphabet.");
		}
	}
	
	static boolean isAlphabet(char c)
	{
		if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}