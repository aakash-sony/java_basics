import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo2 
{
	public static void main(String[] args)
	{
	    List<String> listOfNames = List.of("Aman","Venkatesh","Raj","Scott","Smith");	
	    
	   List<Character> firstChar = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).collect(Collectors.toList());
	   
	   System.out.println(firstChar);
		
	}

}