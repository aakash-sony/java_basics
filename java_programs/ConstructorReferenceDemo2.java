
import java.util.Arrays;
import java.util.function.Function;

class Person 
{
    private String name;

    public Person(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
    
    
}

public class ConstructorReferenceDemo2
{
    public static void main(String[] args) 
    {
    	Function<Integer,Person[]> fn2 = Person[]::new;
    	Person [] arr = fn2.apply(3); //3 is size if the array
    	
    	arr[0] = new Person("A");
    	arr[1] = new Person("B");
    	arr[2] = new Person("C");
    	
    	System.out.println(Arrays.toString(arr));
    }
}