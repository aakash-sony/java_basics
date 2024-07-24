import java.util.Vector;
import java.util.function.Consumer;

public class ForEachInternals3 {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		fruits.add("KIWI");		
		
		Consumer<String> cons = new Consumer<String>() 
		{
			@Override
			public void accept(String fruit) 
			{
				System.out.println(fruit.toUpperCase());				
			}
		};
		
		fruits.forEach(cons);

	}

}