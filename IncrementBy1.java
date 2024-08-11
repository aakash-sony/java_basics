import java.util.Scanner;
public class IncrementBy1
{
     public static void main(String args[])
     {
	 int rev = 0, rev1 = 0, temp, r;
         Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int num = sc.nextInt();
	
	temp = num;

	while(temp != 0)
	{
	   r = temp % 10;
	    r++;
	   rev = rev * 10 + r;
	   temp = temp / 10; 
	}
	
	while(rev != 0)
	{
	   r = rev % 10;
	   rev1 = rev1 * 10 + r;
	   rev = rev / 10;
	}

	System.out.println("Number before Increment: "+num);

	System.out.println("Number after 1 Increment in all digits: "+rev1);
     }
}