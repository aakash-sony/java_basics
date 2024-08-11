import java.util.*;
public class HashMapDemo05 
{
     public static void main(String[] argv) 
     {
          Map<String,String> map = new HashMap<>(9, 0.85f);
          map.put("key", "value");
          map.put("key2", "value2");
          map.put("key3", "value3");
		  map.put("key7","value7");


		   Set keys = map.keySet();//keySet return type is Set
		   System.out.println(keys ); //[]

          Collection val = map.values(); //values return type is collection
          System.out.println(val);
         
		  map.forEach((k,v)-> System.out.println(k+" : "+v));
		  
          	  
      }
}