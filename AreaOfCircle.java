/*
* WAP to find out area of Circle by taking the radius value from Command Line Argument.
----------------------------------
*/
public class AreaOfCircle
{
     public static void main(String[] args)
    {
       double radius = Double.parseDouble(args[0]);
       final double PI = 3.14;
       
       double areaOfCircle = PI * radius * radius;
       System.out.println("Area of circle is: "+areaOfCircle);
     }
}