import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(89);
		al.add(15);
		al.add(12);
		al.add(9);		
		
		Collections.sort(al,(i1,i2)-> i2.compareTo(i1));
		
		System.out.println(al);	

	}
}