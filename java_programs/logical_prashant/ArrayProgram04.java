/*
 Given an array of integers length 3, return an array with the elements
 "rotated left" so {1, 2, 3} will become {2, 3, 1}.
*/
import java.util.Arrays;
public class ArrayProgram04
{
	public static void main(String args[])
	{
		int a[] = {17, 65, 78};	
		System.out.println(Arrays.toString(rotateElement(a)));	
	}
	
	static int[] rotateElement(int a[])
	{
		int temp = a[0];
		a[0] = a[1];
		a[1] = a[2];
		a[2] = temp;
		
		return a;
	}
	
}