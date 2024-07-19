import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) 
	{
	  //verify whether a person is eligible for voting or not
	  Predicate<Integer> p2 = age -> age > 18;

	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter your Age :");
	  int age = sc.nextInt();
	  
	  System.out.println(" Are u eligible 4 voting :"+p2.test(age));
	  
	  
	}

}