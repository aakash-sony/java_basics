enum Shape 
{
    CIRCLE, SQUARE, TRIANGLE;

    static 
	{
        System.out.println("static block ");
    }

    {
        System.out.println("instance block");
    }

    private Shape()
	{
		System.out.println("Constructor");
	}


}
public class Enum1
{
  public static void main(String[] args) 
	{
	  System.out.println(Shape.CIRCLE);
	}
}