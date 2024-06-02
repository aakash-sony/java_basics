import java.util.Scanner;
class Shape
{
	protected int x;
	
	public Shape(int x)
	{
		this.x = x;
	}	
}
class Square extends Shape
{
	public Square(int side) 
	{
		super(side);	
	}
	
	public void areaOfSquare()
	{
		double area = x * x;
		System.out.println("Area of square is :"+area);
	}
	
}

public class SuperDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of the side :");
		int side = sc.nextInt();
		
		Square ss = new Square(side);
		ss.areaOfSquare();
		sc.close();

	}

}