import java.util.Scanner;
class ExceptionHandling4
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
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Main ended..");
	}
}