
import java.util.Arrays;
import java.util.Comparator;

class Person
{
    String name;
    
    public Person(String name)
    {
        this.name = name;
    }

    public int personInstanceMethod1(Person person)
    {
        return this.name.compareTo(person.name);
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}  
    
    
}

public class ArbitraryRefDemo1
{
    public static void main (String[] args) throws Exception
    {
    	
        Person[] personArray = {new Person("Zuber"),new Person("Raj"), new Person("Ankit"), new Person("Abhishek")};    
        Arrays.sort(personArray, Person::personInstanceMethod1);
    
        System.out.println(Arrays.toString(personArray));
             
    }

}