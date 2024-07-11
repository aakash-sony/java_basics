/*
 *   Compare the 2 array and if every element matched
 *   return true and if any single element not matched
 *   at once return false and break;
*/
import java.util.*;
public class ArrayProgram20
{
	public static void main(String args[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		int b[] = {1, 2, 3, 6, 5, 6};
		System.out.println((Arrays.equals(a, b)));
		System.out.println((Arrays.compare(a, b)));
	}
	
}