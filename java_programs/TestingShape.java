abstract class Shape 
{
	abstract double getArea();

	abstract double printDetails();
}

class Rectangle extends Shape {
	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double getArea() {

		return length * breadth;
	}

	@Override
	double printDetails() {
		System.out.println("Type = Rectangle");
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area: " + getArea());
		return 0;
	}

}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	double getArea() {

		return 3.14 * radius * radius;
	}

	@Override
	double printDetails() 
	{
		System.out.println("Type: Circle");
		System.out.println("Radiud: "+radius);
		System.out.println("Area: "+getArea());
		return 0;
	}

}

class Triangle extends Shape {
	double base;
	double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double getArea() {

		return 0.5 * base * height;
	}

	@Override
	double printDetails() {
		System.out.println("Type: Triangle");
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		System.out.println("Area: " + getArea());
		return 0;
	}

}

public class TestingShape 
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(20, 10);
		r.printDetails();
		System.out.println();
		Circle c = new Circle(3.4);
		c.printDetails();
		System.out.println();
		Triangle t = new Triangle(10, 15);
		t.printDetails();
	}

}
