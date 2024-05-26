import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First side of triangle: ");
		double side1 = sc.nextDouble();
		
		System.out.print("Enter Second side of triangle: ");
		double side2 = sc.nextDouble();
		
		System.out.print("Enter Third side of triangle: ");
		double side3 = sc.nextDouble();
		
		if(isTriangle(side1, side2, side3))
		{
			System.out.println("This is a Triangle.");
		}
		else
		{
			System.out.println("This is not a Triangle.");
		}
	}
	
	static boolean isTriangle(double a, double b, double c)
	{
		if(((a + b) > c) && ((b + c) > a) && ((c + a) > b))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}