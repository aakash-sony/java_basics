import java.util.*;
public class ReverseNumber
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int num = sc.nextInt();

        reverse(num);  
    
     }
  
      static void reverse(int number)
      {
	 int reverse = 0;
	 while(number != 0)
	 {
	   int r = number % 10;
	   reverse = reverse * 10 + r;
 	   number = number / 10;
	 }
	System.out.println("Reverse number: "+reverse);
      }
}