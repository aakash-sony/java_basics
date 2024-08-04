import java.util.*;
public class HashMapDemo02
{
public static void main(String args[]) 
	{
			Map<Integer,String> map = new HashMap<>(); 
			map.put(1, "C");
			map.put(2, "C++");
			map.put(3, "Java");
			map.put(4, ".net");
		
			map.forEach((k,v)->System.out.println("Key :"+k+" Value :"+v) );           
			           
			System.out.println("Return Old Object value :"+map.put(4,"Python"));  

			Set keys =  map.keySet();
			System.out.println("All keys are :"+keys); //[1,2,3,4]

			Collection values = map.values();
			System.out.println("All values are :"+values);
		
			for(Map.Entry m : map.entrySet())
			 {  
				 System.out.println(m.getKey()+" : "+m.getValue());  
			}  

			System.out.println("Retrieving using Iterator :");

			Iterator itr=  map.entrySet().iterator();

			while(itr.hasNext())
		    {
				System.out.println(itr.next());
			}
	}    
}