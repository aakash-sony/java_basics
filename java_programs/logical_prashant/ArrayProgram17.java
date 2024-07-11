/*
  Binary Searching:-
  ----------------
*/
import java.util.*;
public class ArrayProgram17
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
	//	Arrays.sort(a);
		System.out.println("Array: "+Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element which you want to search: ");
		int element = sc.nextInt();
		binarySearching(a, element);
			
	}

	static void binarySearching(int arr[], int ele)
	{
		int startingIndex = 0;
		int endingIndex = arr.length - 1;
		int middleIndex = (startingIndex + endingIndex) / 2;
		
		while(startingIndex <= endingIndex)
		{
			if(arr[middleIndex] == ele)
			{
				System.out.println(ele+" is available at index "+middleIndex);
				break;
			}
			else if(arr[middleIndex] < ele)
			{
				startingIndex = middleIndex + 1;
			}
			else if(arr[middleIndex] > ele)
			{
				endingIndex = middleIndex - 1;
			}
			middleIndex = (startingIndex + endingIndex) / 2;
		}
		if(startingIndex > endingIndex)
		{
			System.out.println("Element not found!!");
		}
			
	}
}