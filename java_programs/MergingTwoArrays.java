import java.util.*;
class MergingTwoArrays
{
	static int arr1[], arr2[], arr3[];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first array size: ");
		int size1 = sc.nextInt();
		
		arr1 = new int[size1];
		
		initializeArray(arr1, size1, sc);
		
		System.out.println("The first Array is: ");
		printingArray(arr1, size1);	
		
		System.out.print("\nEnter the second array size: ");
		int size2 = sc.nextInt();
		
		arr2 = new int[size2];
		
		initializeArray(arr2, size2, sc);
		
		System.out.println("The second Array is: ");
		printingArray(arr2, size2);	
		
		arr3 = new int[size1 + size2];
		
		System.out.println("\nAfter merging the elements Array is: ");
		mergingTwoArrays(size1, size2);
		
		int size3 = size1 + size2;
		printingArray(arr3, size3);
			   	
	}
	
	static void initializeArray(int arr[], int size, Scanner sc)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter the "+(i + 1)+" element: ");
			arr[i] = sc.nextInt();
		}

	}
	
	static void printingArray(int arr[], int size)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	

	static void mergingTwoArrays(int size1, int size2)
	{
		for(int i = 0; i < size1; i++)
		{
			arr3[i] = arr1[i];
		}
		
		for(int i = 0; i < size2; i++)
		{
			arr3[size1 + i] = arr2[i];
		}
	}
	
}