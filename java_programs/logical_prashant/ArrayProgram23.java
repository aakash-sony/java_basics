/*
 *  Merge two array into a single new array and return
 *  the merged array with help of pre-defined method.
 */
import java.util.*;
public class ArrayProgram23
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		int b[] = {7, 8};
		
		int result[] = Arrays.copyOf(a, a.length + b.length);
		int index = a.length;
		for(int i = 0; i < b.length; i++)
		{
			result[index++] = b[i];
		}
	
		System.out.println("New merged array: "+Arrays.toString(result));
	}
	
}