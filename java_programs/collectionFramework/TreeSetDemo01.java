import java.util.*;
public class TreeSetDemo01 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> t1 = new TreeSet<>();
		t1.add(4);
		t1.add(7);  
		t1.add(2);
		t1.add(1);
		t1.add(9);	
		System.out.println(t1);

		NavigableSet<String> t2 = new TreeSet<>();
		t2.add("Orange");
		t2.add("Mango");
		t2.add("Banana");
		t2.add("Grapes");
		t2.add("Apple");		
		System.out.println(t2);		
	}
}