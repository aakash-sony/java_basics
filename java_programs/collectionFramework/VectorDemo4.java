import java.util.List;
import java.util.Vector;

record Product(Integer productId, String productName)
{
	
}

public class VectorDemo4
{
	public static void main(String[] args)
	{
		List<Product> listOfProducts = new Vector<>();
		listOfProducts.add(new Product(1,"Camera"));
		listOfProducts.add(new Product(2,"Mobile"));
		listOfProducts.add(new Product(3,"Laptop"));
		listOfProducts.add(new Product(4,"Head Phone"));
		
		listOfProducts.forEach(System.out::println);
	}

}