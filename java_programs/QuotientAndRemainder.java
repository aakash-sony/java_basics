import java.util.Scanner;
class QuotientAndRemainder
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter Second number: ");
		int number2 = sc.nextInt();
		
		System.out.println(findQuotientAndRemainder(number1, number2));
				
     }
	 
	 static String findQuotientAndRemainder(int a, int b)
	 {
		int quotient = a / b;
		int remainder = a % b;
		
		return "Quotient is: "+quotient+"\nRemainder is: "+remainder;
	 }
}