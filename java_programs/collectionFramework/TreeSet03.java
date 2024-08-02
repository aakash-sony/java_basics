import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet03 
{
      public static void main(String[] argv) 
      {
           TreeSet<Double> set = new TreeSet<Double>();
           for (int i = 0; i < 5; i++)
                set.add(Math.random());

           Iterator iter = set.iterator();
           while (iter.hasNext())
                System.out.println(iter.next());

     }
}