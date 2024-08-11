abstract class Shape
{
	public abstract void draw();
}

class Square extends Shape
{
	@Override
	
	public void draw() 
	{
		System.out.println("Drawing Square");		
	}	
}

class Rectangle extends Shape
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing Rectangle");		
	}	
}
public class AbstractDemo1 
{
	public static void main(String[] args) 
	{
		Shape s ;
		s = new Square(); s.draw();
        s = new Rectangle(); s.draw();
	}

}