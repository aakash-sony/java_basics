import java.util.*;
public class PrimeNumberDemo
{
    public static void main(String args[])
    {
	PrimeNumber p = new PrimeNumber();
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to checking Prime number: ");
	p.number = sc.nextInt();

	p.checkPrime();
    }
}