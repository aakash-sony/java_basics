import java.util.Scanner;
public class ConvertInLowerCase
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch = sc.next().charAt(0);

	ch = (char)(ch + 32);
	
	System.out.println("Character in lower case: "+ch);

    }
} 