import java.util.Arrays;
import java.util.List;

public class StreamProgram05 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Akash", "Vikas", "Vishal", "Vipul", "Aman", "Ajay", "Alex");
		names.stream().filter(name -> name.length() == 4).sorted().limit(2).forEach(System.out::println);
	}

}