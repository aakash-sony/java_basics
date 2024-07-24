import java.util.Vector;
import java.util.function.Consumer;

public class ForEachInternals2 {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		fruits.add("KIWI");		
		
		Consumer<String> cons = (fruit)-> System.out.println(fruit);
		
		fruits.forEach(cons);

	}

}