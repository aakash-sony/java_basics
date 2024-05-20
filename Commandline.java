/*
Q2) Write a program to perform addition using command line Argument.
-------------------------------------------------------------------
*/
public class Commandline
{
    public static void main(String[] args)
   {
     int x=Integer.parseInt(args[0]);
     int y=Integer.parseInt(args[1]);
    System.out.println("sum= "+(x+y));
    
   }

}