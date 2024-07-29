import java.util.*;
public class HashSetDemo01 
{
 public static void main(String args[])
 { 
	    HashSet<Integer> hs = new HashSet<>();
		hs.add(67); 
		hs.add(89);		
		hs.add(33);
		hs.add(45);
		hs.add(12);
		hs.add(35);			
		
		hs.forEach(str-> System.out.println(str));
	}
}