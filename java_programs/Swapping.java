import java.util.Scanner;
class Swapping
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Numbers after swapping are: "+swappingNumber(num1, num2));
		
		
	}
	
	static String swappingNumber(int a, int b)
	{
		int temp = a;
	     a = b;
		 b = temp;
		 return "First number = "+a+" Second number = "+b;
	}
}