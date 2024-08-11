import java.util.Scanner;
class ArraySortingAscending
{
	static int arr[];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		
		 arr = new int[size];
		
		initializeArray(size);
		
		System.out.println("The Array is: ");
		printingArray(size);
		sortingAscending(size);	
			   	
	}
	
	static void initializeArray(int size)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter the "+(i + 1)+" element: ");
			arr[i] = sc.nextInt();
		}

	}
	
	static void printingArray(int size)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
	
	static void sortingAscending(int size)
	{
		int temp;
		for(int i = 0; i < size; i++)
		{
			for(int j = i + 1; j < size; j++)
			{
			    if(arr[i] > arr[j])
				{
			       temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting in ascending order: ");
		printingArray(size);
	}
	
}