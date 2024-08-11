abstract class Shape
{
	protected String shapeType;
	
	public Shape(String shapeType) 
	{
		super();
		this.shapeType = shapeType;
	}
	
	public abstract void draw();
}

class Square extends Shape
{
	public Square(String shape)
	{
		super(shape);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing :"+shapeType);
	}
}
class Rectangle extends Shape
{
	public Rectangle(String shape)
	{
		super(shape);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing :"+shapeType);
	}
}

public class AbstractDemo3 {

	public static void main(String[] args) 
	{
		Square ss = new Square("Square");
		ss.draw();
		
		Rectangle rr = new Rectangle("Rectangle");
		rr.draw();

	}

}