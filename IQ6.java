public class IQ6 
{
	 public static void main(String[] args) 
	 {
		         int number = 1;
		         String letters = "abc"; 
		         number = number(number); 
		         letters(letters); // it is not stored in any variable.  
		         System.out.println(number + letters);    
		      }
		      public static int number(int number) 
		      {
		        number++;
		        return number;
		     }
		    public static String letters(String letters)//abc 
		    {
		        letters += "d";
		        return letters;
		     }
    //Answer-2abc.
}