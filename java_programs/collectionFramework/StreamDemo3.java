import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 
{
	public static void main(String[] args) 
	{
	   //Printing even number without Stream interface
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		
		List<Integer> evenList = new ArrayList<>();
		
		for(Integer x : listOfNumber)
		{
			if(x%2==0)
			{
				evenList.add(x);
			}
		}
		evenList.forEach(System.out::println);
		System.out.println(".............................");
		Stream.of(1,2,3,4,5,6,7,8,9,10,11,12).filter(num -> num%2==0).forEach(System.out::println);
		
		System.out.println(".............................");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);
		al.add(20);
		
		Set<Integer> set = al.stream().filter(num -> num%2==0).collect(Collectors.toSet());
		set.forEach(System.out::println);
	}
}