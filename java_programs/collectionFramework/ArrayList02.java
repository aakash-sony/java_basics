import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList02
{
	public static void main(String[] args) 
	{		    
		ArrayList<String> city= new ArrayList<>();	
		
		
		city.ensureCapacity(3); //resize the capacity of Arraylist	
		city.add("Hyderabad");
		city.add("Mumbai");
		city.add("Delhi"); 
		

		city.add("Kolkata");
		System.out.println("ArrayList: " + city);		
	 }
}