import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

record Customer(Integer customerNumber, String customerName, Double customerBill) 
{
}

public class CustomerClassSorting {

	public static void main(String[] args) {
		ArrayList<Customer> al = new ArrayList<>();
		al.add(new Customer(101, "Akash", 4500.00));
		al.add(new Customer(102, "Vipul", 4900.00));
		al.add(new Customer(103, "Hemant", 7500.00));
		al.add(new Customer(104, "Laxman", 3500.00));
		
		Comparator<Customer> custNum =  new Comparator<Customer>()
		{
			@Override
			public int compare(Customer c1, Customer c2)
			{
				return c1.customerNumber().compareTo(c2.customerNumber());
			}
		};
		
		Comparator<Customer> custName =  new Comparator<Customer>()
		{
			@Override
			public int compare(Customer c1, Customer c2)
			{
				return c1.customerName().compareTo(c2.customerName());
			}
		};
		
		Comparator<Customer> custBill =  new Comparator<Customer>()
		{
			@Override
			public int compare(Customer c2, Customer c1)
			{
				return c1.customerBill().compareTo(c2.customerBill());
			}
		};
		
		Collections.sort(al, custNum);
		System.out.println("Sorting based on customerNumber: ");
		al.forEach(System.out::println);
		System.out.println("-----------------------------------");
		Collections.sort(al, custName);
		System.out.println("Sorting based on customerName: ");
		al.forEach(System.out::println);
		System.out.println("-----------------------------------");
		Collections.sort(al, custBill);
		System.out.println("Sorting based on customerBill: ");
		al.forEach(System.out::println);
	}

}
