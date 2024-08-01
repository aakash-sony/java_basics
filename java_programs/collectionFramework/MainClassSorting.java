import java.util.ArrayList;
import java.util.Collections;
record Product(Integer productNumber, String productName, Double productPrice) implements Comparable<Product>
{
	@Override
	public int compareTo(Product o) {
		return this.productName().compareTo(o.productName());
	}
}

public class MainClassSorting {

	public static void main(String[] args) {
		ArrayList<Product> a = new ArrayList<>();
		a.add(new Product(101,"Laptop", 50000.00));
		a.add(new Product(101,"Mobile", 15000.00));
		a.add(new Product(101,"Headphone", 5000.00));
		a.add(new Product(101,"Charger", 500.00));
		a.add(new Product(101,"NeckBand", 5000.00));
		
		Collections.sort(a);

		a.forEach(System.out::println);

	}

}
