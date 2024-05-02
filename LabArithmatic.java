public class LabArithmatic
{
   public static void main(String args[])
   {
      double number1 = Double.parseDouble(args[0]);
      double number2 = Double.parseDouble(args[1]);

	System.out.println("Addition is: "+(number1+number2));
        System.out.println("Subtraction is: "+(number1-number2));
        System.out.println("Multiplication is: "+(number1*number2));
        System.out.println("Division is: "+(number1/number2));	
  }
}