import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 
{
	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Raj","Rahul","Ankit","Roshan","Scott");
		
		listOfName.stream().filter(str -> str.startsWith("R")).forEach(System.out::println); 
	}
}