import java.util.Scanner;

interface AdvancedArithmetic 
{
	public abstract int divisorSum(int n);
}

public class TestingCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		MyCalculator m = new MyCalculator();
		System.out.println("Divisior sum: "+m.divisorSum(num));

		sc.close();
	}

}
class MyCalculator implements AdvancedArithmetic
{
	public int divisorSum(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
}
