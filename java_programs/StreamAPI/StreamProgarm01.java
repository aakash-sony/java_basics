import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgarm01 {

	public static void main(String[] args) {

		Stream<Integer> strm = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 strm.filter(n -> n%2==0).map(a -> a*a+" ").collect(Collectors.toList()).forEach(System.out::print);
	}

}