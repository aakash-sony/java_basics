
/*
Q) Write a program to find out the area of Rectangle where length and  breadth of the Rectangle must be taken from user from command line argument.
*/
public class AreaOfRectangle
{
    public static void main(String []args)
   {
      double length = Double.parseDouble(args[0]);
      double width = Double.parseDouble(args[1]);
      System.out.println(length * width);
   }

}