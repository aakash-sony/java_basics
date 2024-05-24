public class Clothing extends Product
{
    private String productSize;
    
	public Clothing(String productName, double productPrice, int productQty, String productSize) {
		super(productName, productPrice, productQty);
		this.productSize = productSize;
	}



	public void displayInfo()
	{
		super.displyInfo();
		System.out.println("Product Size: "+productSize);
	}
    
}
