/*
1) Write a program to find out the cube of a number where number must be    taken from command line argument.
*/
public class Cube
{
    public static void main(String []args)
    {
      int num = Integer.parseInt(args[0]);
      System.out.println(num*num*num);

    }

}