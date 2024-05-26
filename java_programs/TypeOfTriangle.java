import java.util.Scanner;
class TypeOfTriangle
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
		
		checkingTriangleType(side1, side2, side3);
		
	}
	
	static void checkingTriangleType(double a, double b, double c)
	{
		if(a == b && a == c)
		{
			System.out.println("Equilateral Triangle.");
		}
		else if((a == b && a != c)||(b == c && b != a)||(c == a && c != b))
		{
			System.out.println("Isosceles Triangle.");
		}
		else
		{
			System.out.println("Scalene Triangle.");
		}
	}
}