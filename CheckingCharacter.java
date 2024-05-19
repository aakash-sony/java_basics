import java.util.*;
public class CheckingCharacter
{
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a character: ");
	char ch = sc.next().charAt(0);

	characterChecking(ch);
     }

      static void characterChecking(char ch)
     {
	if(ch >= 65 && ch <= 90)
	{
	    System.out.println("Upper case.");
	}
	else if(ch >= 97 && ch <= 122)
	{
	  System.out.println("Lower case.");
	}
	else if(ch >= 48 && ch <= 57)
	{
	   System.out.println("Digits.");
	}
	else
	{
	   System.out.println("Special character.");
	}
     }
}