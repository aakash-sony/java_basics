import java.util.Scanner;
class ExceptionHandling5
{
	public static void main(String args[])
	{
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter "+(i+1)+" Element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is: ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		try
		{
			System.out.println(arr[6]);
			System.out.println("Try Block");
		}
		catch(Exception e)
		{
			System.out.println(arr[5]);
			System.out.println(e);
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("This is Exception handling chapter");
		}
		System.out.println("Main ended..");
	}
}