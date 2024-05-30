import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();
		
		double sum = getAddition(num1, num2);
		System.out.println("Sum: "+sum);
		
	}
	static double getAddition(double a, double b)
	{
		return a + b;
	}
}