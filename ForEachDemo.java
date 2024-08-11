import java.util.Arrays;

public class ForEachDemo 
{
  public static void main(String[] args) 
  {
	String []fruits = {"Mango","Orange","Kiwi","Apple"};
	
	Arrays.sort(fruits);
	
	for(String fruit : fruits)
	{
		System.out.println(fruit.toUpperCase());
	}
	
  }
}