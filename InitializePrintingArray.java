import java.util.*;
public class InitializePrintingArray
{
     static int arr[];
     public static void main(String args[])
     {
	Scanner sc1 = new Scanner(System.in);

	System.out.print("Enter Array Size: ");	 
	int size = sc1.nextInt();

	arr = new int[size];
	initilizingArray(size);
	printingArray(size);

     }

     static void initilizingArray(int size)
     {
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < size; i++)
	{
	    System.out.print("Enter "+(i+1)+" Element: ");
              arr[i] = sc.nextInt();
        }
     }
     
     static void printingArray(int size)
     {
        System.out.println("The Array is: ");
	for(int i = 0; i < size; i++)
	{ 
           System.out.print(arr[i]+" ");
        }
     }
}