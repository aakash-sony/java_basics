import java.util.*;
public class PrintPrimeNumberDemo
{
     public static void main(String args[])
     {
        PrintPrimeNumber p1 = new PrintPrimeNumber();
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter last number: ");
	p1.lastNumber = sc.nextInt();

         p1.printingPrime();
     }
}