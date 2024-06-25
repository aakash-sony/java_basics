interface Drawable
{
   void draw();
}
public class FunctionalInterface25 {
	public static void main(String[] args) 
	{
	   Drawable b = () -> System.out.println("Drawing...");	
	}
	  b.draw();
}