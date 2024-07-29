import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LinkedListDemo03 {

	public static void main(String[] args) 
	{
		
		
		List<String> listOfName = Arrays.asList("Ravi","Rahul","Ankit", "Rahul");
		
		LinkedList<String> list = new LinkedList<>(listOfName); 
		list.forEach(System.out::println);
		
		
	}

}