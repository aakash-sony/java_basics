/*
Que-1) Write a java program to calculate the curved surface area of a cube?
 Formula-6*side Square.
------------------------------------------------------------------------------
*/
public class SurfaceAreaOfCube
{
	public static void main(String args[])
        {
             float side = Float.parseFloat(args[0]);
             float surfaceArea = 6 * side;

	    System.out.println("Surface Area of cube: "+surfaceArea);  
         }
}