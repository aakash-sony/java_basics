
public class Circle
{
    private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea()
	{
		if(radius >= 0)
		{
			return 3.14 * radius * radius;
		}
		else
		{
			return -1;
		}
	}
}
