/*
Que-2) write a java program to calculate the total surface area of a cylinder? 
 Formula- 2 pi square r * 2 pi r h (take the pi as 3.14).
--------------------------------------------------------------------------------
*/
public class SurfaceAreaOfCylinder
{
    public static void main(String args[])
   {
	float radius = Float.parseFloat(args[0]);
	double surfaceArea = 2 * 3.14 * 3.14 * radius * radius;

	System.out.println("Surface area of Cylinder: "+surfaceArea); 
   }
}