/*
--Insert the element at specific position
*/
import java.util.*;
public class ArrayProgram26
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element that you want to insert: ");
		int ele = sc.nextInt();
		
		System.out.println("At which place you want to insert: ");
		int place = sc.nextInt();
		
		int result[] = insertingElement(a, ele, place);
		System.out.println("Array is: "+Arrays.toString(result));
	}
	
	public static int[] insertingElement(int arr[], int ele, int place)
	{
		int newArr[] = Arrays.copyOf(arr, arr.length + 1);
		if(place >= 1 && place <= newArr.length)
		{
			for(int i = newArr.length - 1; i > place - 1; i--)//
			{
				newArr[i] = newArr[i-1];
			}
			newArr[place - 1] = ele;
		}
		else
		{
			System.out.println("Place can't be negative or zero and not be greater than length.");
			return arr;
		}
		return newArr;
	}
}