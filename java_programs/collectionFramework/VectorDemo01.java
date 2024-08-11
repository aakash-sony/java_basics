import java.util.Vector;

public class VectorDemo01 {

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahmadabad");
		listOfCity.add("Vanaras");
		
		//List interface sort(Comparator cmp) method
		listOfCity.sort(String::compareTo);
		
		//Converting Collection to array
		Object[] array = listOfCity.toArray();
		
		for(Object obj : array)
		{
			System.out.println(obj);
		}
		
	}

}