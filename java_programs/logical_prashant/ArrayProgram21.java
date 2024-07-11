/*
 *  Copy all the element of one array into another array 
 *  and send the copied array back to calling place.
 */
 import java.util.*;
public class ArrayProgram21
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		System.out.println("Original: "+Arrays.toString(a));
		int result[] = copyingArray(a);
		System.out.println("Copy: "+Arrays.toString(result));
	}
	
	public static int[] copyingArray(int arr[])
	{
		int newArr[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			newArr[i] = arr[i];
		}
		return newArr;
	}
}