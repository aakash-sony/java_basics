import java.util.*;
public class HashMapDemo04
{
public static void main(String args[]) 
	{
		HashMap<Integer,String> newmap1 = new HashMap<>();

		HashMap<Integer,String> newmap2 = new HashMap<>();	  

		newmap1.put(1, "OCPJP");
		newmap1.put(2, "is");
		newmap1.put(3, "best");
			  
		System.out.println("Values in newmap1: "+ newmap1);

		newmap2.put(4, "Exam");

		newmap2.putAll(newmap1);

		newmap2.forEach((k,v)->System.out.println(k+" : "+v));		
   }    
}