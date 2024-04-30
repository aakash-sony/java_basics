/*
Q) Write a java program to covert string to double using parseDouble() and multiply two Floating -point Numbers and display the result by taking input from the command line argument?
------------------------------------------------------------------------------------------------
*/
public class Multiplication
{
  public static void main(String args[])
  {
    double num1 = Double.parseDouble(args[0]);
    double num2 = Double.parseDouble(args[1]);

    System.out.println("Multiplication: "+(num1 * num2));
  }
}