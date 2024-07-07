/*
Given an array of integers length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.
*/
import java.util.Arrays;
public class ArrayProgram07
{
	public static void main(String args[])
	{
		int a[] = {17, 65, 78};	
		System.out.println("Larger element: "+Arrays.toString(largestElement(a)));	
	}
	
	static int[] largestElement(int a[])
	{
		int larger = Math.max(a[0], a[a.length-1]);
		a[0] = larger;
		a[1] = larger;
		a[2] = larger;
		
		return a;
	}
	
}