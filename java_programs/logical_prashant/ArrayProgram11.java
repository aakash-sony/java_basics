 /*
 Given an integer array length 2,return true if it contains a number 2 or 3. 
*/ 
import java.util.*;
public class ArrayProgram11
{
	public static void main(String args[])
	{
		int a[] = {3, 65};	
		System.out.println(returningElement(a));	
	}
	
	static boolean returningElement(int a[])
	{
		if(a[0] == 2 || a[0] == 3 || a[1] == 2 || a[1] == 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

