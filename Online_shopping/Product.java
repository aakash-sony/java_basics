public class Product
{
   protected String productName;
   protected double productPrice;
   protected int productQty;
   
   public Product(String productName, double productPrice, int productQty) {
	super();
	this.productName = productName;
	this.productPrice = productPrice;
	this.productQty = productQty;
}
   public void displyInfo()
   {
	   System.out.println("Product Name: "+productName);
	   System.out.println("Product Price: "+productPrice);
	   System.out.println("Product Quantity: "+productQty);
   }
   
   public double calculateTotalCost(int productQty)
   {
	   double totalCost = this.productQty * productPrice;
	   return totalCost;
   }
   
}
