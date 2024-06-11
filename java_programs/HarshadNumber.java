import java.util.Scanner;

class HarshadNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(isHarshadNumber(n))
		{
			System.out.println("It is a harshad number.");
		}
		else
		{
			System.out.println("It is not a harshad number.");
		}

	}
	static boolean isHarshadNumber(int n)
	{
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		if(temp % sum == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
