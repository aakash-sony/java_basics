import java.util.Scanner;
public class ArithmaticOperation
{
     static int n1, n2, ch;
     static char ch1;
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
	 System.out.print("Enter first number: ");
	 n1 = sc.nextInt();
	 System.out.print("Enter second number: ");
	 n2 = sc.nextInt();

	choiceSelection();

     }

     public static void choiceSelection()
     {
	 Scanner sc1 = new Scanner(System.in);
         System.out.println("*****Calculator********");
       do
	{
	 System.out.println("1. Adding.");
	 System.out.println("2. Subtraction.");
	 System.out.println("3. Multiplication.");
	 System.out.println("4. Division.");
	 System.out.println("5. Exit.");

	 System.out.print("Enter your choice for performing any operation: ");
	 ch = sc1.nextInt();

	 switch(ch)
	 {
	    case 1: doSum(n1, n2); break;
	    
            case 2: doSub(n1, n2); break;

	    case 3: doMultiply(n1, n2); break;

	    case 4: doDiv(n1, n2); break;

	    case 5: System.exit(0); break;

	    default: System.out.println("Invalid Choice!!");
	 }
	  System.out.print("Do you want to continue(y/n): ");
	  ch1 = sc1.next().charAt(0);
	}while(ch1 == 'y' || ch1 == 'Y');

	System.out.println("Thank you!!");
     }

      public static void doSum(int a, int b)
      {
	System.out.println("Addition is: "+(a + b));
      } 

      public static void doSub(int a, int b)
      {
	 System.out.println("Subtraction is: "+(a - b));
      } 

      public static void doMultiply(int a, int b)
      {
	 System.out.println("Multiplication is: "+(a * b));
      } 
    
      public static void doDiv(int a, int b)
      {
	 System.out.println("Division is: "+(double)(a / b));
      } 

}