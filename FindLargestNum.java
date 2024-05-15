import java.util.Scanner;
public class FindLargestNum
{
     static int[] arr;
     static int max;
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array: ");
	int size = sc.nextInt();

	arr = new int[size];

	initializeArray(size);
	printingArray(size);
	findingLargest(size);
	
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

     static void printingArray(int size)
     {
	System.out.println("The Array is: ");
        for(int i = 0; i < size; i++)
	{
	   System.out.print(" "+arr[i]+" ");
	}
     }

     static void findingLargest(int size)
     {
	max = arr[0];
	for(int i = 0; i < size; i++)
	{
	    if(arr[i] > max)
	    {
		max = arr[i];
            }
	}
	System.out.println("Maximum value is : "+max);
     }
}










