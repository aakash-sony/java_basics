import java.util.Scanner;

public class MethodOverloading{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		MethodOverload cc = new MethodOverload();
		
		System.out.println("Enter a number: ");
		int num1  = sc.nextInt();
		
		System.out.println("Enter a character: ");
		char ch1  = sc.next().charAt(0);
		
		cc.display(num1, ch1);
		
		System.out.println("Enter a number: ");
		int num2  = sc.nextInt();
		
		System.out.println("Enter a character: ");
		char ch2  = sc.next().charAt(0);
		cc.display(ch2, num2);
		
		sc.close();
	}

}
