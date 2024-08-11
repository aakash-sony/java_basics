
import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius for cylinder : ");
		double radius = sc.nextDouble();

		System.out.println("Enter the height for cylinder : ");
		double height = sc.nextDouble();

		Cylinder c = new Cylinder(radius, height);

		System.out.println("Volume of Cylinder: " + c.getVolume(radius, height));

		System.out.println("Enter the radius for circle: ");
		double radiusC = sc.nextDouble();

		c.setRadius(radiusC);
		System.out.println("Area of Circle : " + c.getArea());

		sc.close();
	}
}
