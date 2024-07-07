/*
Que- Given 2 arrays of integers, a and b, return true if they have the same first element or they have the
  same last element. Both arrays will be length 1 or more. 
*/
public class ArrayProgram03
{
	public static void main(String args[])
	{
		int a[] = {17, 65, 78, 45, 90};
		int b[] = {56, 89, 67, 56, 91};
		System.out.println(checkingElement(a, b));
			
	}
	static boolean checkingElement(int a[], int b[])
	{
		if((a.length > 0 && b.length > 0)&& ((a[0] == b[0])|| (a[a.length - 1] == b[b.length - 1])))
			{
				return true; 
			}
			else
			{
				return false;
			}
	}
	
}