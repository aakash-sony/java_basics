import java.util.*;

public class CubeSurfaceArea 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.print("Enter the length of one side of the cube: ");
        double side = sc.nextDouble();
        
        double surfaceAreaOfCube = 6*side*side;
        
        System.out.println("The Surface Area of Cube is: "+surfaceAreaOfCube);
        
    }
    
}