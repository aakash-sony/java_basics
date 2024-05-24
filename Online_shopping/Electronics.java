public class Electronics extends Product
{
    private String productBrand;

	public Electronics(String productName, double productPrice, int productQty, String productBrand) {
		super(productName, productPrice, productQty);
		this.productBrand = productBrand;
	}

	public void displayInfo()
	{
		super.displyInfo();
		System.out.println("The Product Brand: "+productBrand);
	}

    
}
