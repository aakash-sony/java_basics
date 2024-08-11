
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArbitaryRefDemo2
{
  public static void main(String[] args) 
  {
	//By Using Lambda Expression
	String [] players = {"Virat", "Rohit", "Zaheer", "Rishab", "Abhishek"};
	Arrays.sort(players,(s1, s2)-> s2.compareTo(s1));	
	System.out.println(Arrays.toString(players));
	
	//By using Method Reference	
	String [] players1 = {"Virat", "Rohit", "Zaheer", "Rishab", "Abhishek"};
	Arrays.sort(players1, String::compareTo);
	System.out.println(Arrays.toString(players1));
	
  }
}