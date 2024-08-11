import java.util.Scanner;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		getReversalString(str);
		
	}	
	
	static void getReversalString(String str)
	{
		int length = str.length();
		for(int i = length; i > 0; i--)
		{
			System.out.print(str.charAt(length - 1));
			length--;
		}
		
	}

}