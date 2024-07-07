/*
Given an array of integers length 3, return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}. 
*/

import java.util.Arrays;
public class ArrayProgram05
{
	public static void main(String args[])
	{
		int a[] = {17, 65, 78};	
		System.out.println(Arrays.toString(reverseElement(a)));	
	}
	
	static int[] reverseElement(int a[])
	{
		int temp = a[0];
		a[0] = a[a.length - 1];
		a[a.length - 1] = temp;
		
		return a;
	}
	
}