/*
 *  Merge two array into a single new array and return
 *  the merged array to the calling place.
 *  |- array should be of the same length or diff
 */
import java.util.*;
public class ArrayProgram22
{
	public static void main(String args[])
	{
		int a[] = {78, 32, 232, 32};
		int b[] = {7, 8, 9, 10, 11};
		int result[] = mergingArray(a, b);
		System.out.println("New merged array: "+Arrays.toString(result));
	}
	
	public static int[] mergingArray(int arr1[], int arr2[])
	{
		int newArr[] = new int[arr1.length + arr2.length]; 
		int index = 0;
		for(int i = 0; i < arr1.length; i++)
		{
			newArr[index++] = arr1[i];
		}
		for(int i = 0; i < arr2.length; i++)
		{
			newArr[index++] = arr2[i];
		}
		return newArr;
	}
}