import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

record Dog(String name)
{
}

public class LinkedListDemo04
{
       public static void main(String[] args)
       {
             List<Dog> d = new LinkedList<>();
             Dog dog = new Dog("Tiger");
             d.add(dog);
             d.add(new Dog("Tommy"));
             d.add(new Dog("Rocky"));

            Iterator<Dog> i3 = d.iterator();
		    i3.forEachRemaining(x -> System.out.println(x.name().toUpperCase())); //java 8      


             System.out.println("size " + d.size());
             System.out.println("Get 1st Position Object " + d.get(1).name());
             
            
        }
}