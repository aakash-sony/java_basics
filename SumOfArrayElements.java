import java.util.Scanner;
public class SumOfArrayElements
{
     static int[] arr;
     static int sum = 0;
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array: ");
	int size = sc.nextInt();

	arr = new int[size];

	initializeArray(size);
	printingSumOfElements(size);
	
     }

     static void initializeArray(int size)
     {
	Scanner sc1 = new Scanner(System.in);
	for(int i = 0; i < size; i++)
        {
	    System.out.print("Enter "+(i + 1)+" Element: ");
	    arr[i] = sc1.nextInt();
	}
     }

     static void printingSumOfElements(int size)
     {
	System.out.println("The Array is: ");
        for(int i = 0; i < size; i++)
	{
	   System.out.print(" "+arr[i]+" ");
	   sum = sum + arr[i];
	}
 	System.out.println("Sum of Elements: "+sum);
     }
}