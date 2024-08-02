import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 
{
     public static void main(String[] a) 
     {
          Set<Apple> set = new TreeSet<Apple>();
          set.add(new Apple("Apple01"));
          set.add(new Apple("Apple02"));
          set.add(new Apple("Apple03"));
          System.out.println(set);
          System.out.println("-------------");
          set.forEach(System.out::println);
     }
}
class Apple implements Comparable<Apple>
{
	private String name;
	
	public Apple(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + "]";
	}

	@Override
	public int compareTo(Apple o) {
		
		return this.name.compareTo(o.name);
	}
	
}