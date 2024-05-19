import java.util.Scanner;
public class FirstNSquare
{
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	FirstNSquare sq = new FirstNSquare();
	sq.FindingSquare(num);
     }

     public void FindingSquare(int n)
     {
	for(int i = 1; i <= n; i++)
	{
	    System.out.print(i * i+" ");
	}
     }
}