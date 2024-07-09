/*
  Given an array of integers, return a new array length 2 containing the first and last elements 
  from the original array. The original array will be length 1 or more.
*/
  
import java.util.*;
public class ArrayProgram10
{
	public static void main(String args[])
	{
		int a[] = {17, 65, 78};	
		System.out.println(Arrays.toString(returningElement(a)));	
	}
	
	static int[] returningElement(int a[])
	{
		return new int []{a[0], a[2]};
	}
	
}