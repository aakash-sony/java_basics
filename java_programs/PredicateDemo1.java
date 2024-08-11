import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo1 
{
	public static void main(String[] args)
	{
		//Verify whether a number is even or odd
		Predicate<Integer> p = num -> num % 2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int no = sc.nextInt();
		
		System.out.println(no+" is even ?"+p.test(no));
		sc.close();              

	}

}