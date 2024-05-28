
public class Cylinder extends Circle
{
	double height;

	public Cylinder(double radius, double height) 
	{
		super(radius);
		this.height = height;
	}
	
	public double getVolume(double radius, double height)
	{
		if(height >= 0)
		{
			return 3.14 * radius * radius * height;
		}
		else
		{
			return -1;
		}
	}
	
}
