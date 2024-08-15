import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram02 {

	public static void main(String[] args) {
		Stream<String> strm = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
		strm.filter(str -> str.isEmpty()!= true).map(str1 -> str1+"").collect(Collectors.toList()).forEach(System.out::print);
	}
}