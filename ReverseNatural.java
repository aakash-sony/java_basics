import java.util.*;
public class ReverseNatural
{
      public static void main(String args[])
      {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int n= sc.nextInt();
	
	  System.out.println("Reverse Natuarl number is: ");
	  for(int i = n; i >= 1; i--)
	  {
	      System.out.println(i);
	  }
      }
}
