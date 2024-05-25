import java.util.Scanner;
class AsciiValue
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character to check Ascii value: ");
		char ch = sc.next().charAt(0);
		
		int c = getAsciiValue(ch);
		System.out.println("Ascii value of "+ch+" is "+c);
	}
	
    public static int getAsciiValue(char cha)
	{
		int c = (int) cha;
		return c;
	}
}