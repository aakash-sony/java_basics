
import java.util.WeakHashMap;

record Product(Integer productId, String productName, Double productPrice)
{
	@Override
	public void finalize()
	{
		System.out.println("Product object is eligible for GC");
	}
}


public class WeakHashMapDemo 
{
	public static void main(String[] args) throws Exception
	{
		Product p1 = new Product(111, "Camera", 43000D);
		
		WeakHashMap<Product,String> hm = new WeakHashMap<>();
		hm.put(p1, "Hyderabad");
		System.out.println(hm);
		
		p1 = null;
		
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(hm); //{}
		
	}

}
