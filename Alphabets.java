import java.util.Scanner;
public class Alphabets
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a character: ");
	 char ch = sc.next().charAt(0);

	alphabetsChecking(ch);	
     }
     static void alphabetsChecking(char ch)
     {
	if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
	{
	    if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
	        System.out.println("Vowel.");
            }
	    else
	     {
	         System.out.println("Consonant."); 
	     }
	 }
	else if(ch>=48&&ch<=57)
	{
	    System.out.println("Digit.");
	}
	else
	{
	    System.out.println("Special character");
	}
	
     }
}