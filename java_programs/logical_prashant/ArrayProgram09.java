/*
Given 2 integer arrays, a and b, each length is 3, return a new array length 2
containing their middle elements.
*/
public class ArrayProgram09
{
	public static void main(String args[])
	{
		int a[] = {12, 65, 78};
		int b[] = {67, 89, 54};		
		System.out.println("Updated array: "+Arrays.toSrting(returnArray(int a[], int b[])));	
	}
	
	static int[] returnArray(int a[], int b[])
	{
		return new int[]{a[1], b[1]};
	}
	
} 