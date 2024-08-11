import java.util.*;
public class NEvenNumber
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	System.out.println("First "+number+" even number: ");
	for(int i = 1; i <= 2 * number; i++)
	{
	    if(i % 2 == 0)
	    {
		System.out.println(i);
	    }
	}
    }
}