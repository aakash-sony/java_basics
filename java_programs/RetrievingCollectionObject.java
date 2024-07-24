import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject 
{
	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		fruits.add("KIWI");		          
		 
		System.out.println("BY USING TOSTRING METHOD :");		
		System.out.println(fruits.toString());
		
		System.out.println("BY USING ORDINARY FOR LOOP :");	
		for(int i=0; i<fruits.size(); i++)
		{
			System.out.println(fruits.get(i));
		}
		
		System.out.println("BY USING FOR EACH LOOP :");	
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("BY USING ENUMERATION INTERFACE :");	
		
		Enumeration<String> ele = fruits.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
	}
}