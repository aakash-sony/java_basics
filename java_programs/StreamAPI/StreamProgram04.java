import java.util.Arrays;

public class StreamProgram04 {

	public static void main(String[] args) {
		Integer[] arr = { -3, 2, -5, 6, -1, 4 };
		Integer sumOfSquares = Arrays.stream(arr).filter(n -> n > 0).map(n1 -> n1 * n1).reduce(0, Integer::sum);
		System.out.println(sumOfSquares);

	}

}