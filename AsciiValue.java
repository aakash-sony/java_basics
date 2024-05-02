public class AsciiValue
{
   public static void main(String args[])
  {
     char ch = args[0].charAt(0);
     int ascii = (int)ch;
     System.out.println("Ascii value of "+ch+" is: "+ascii);
  }	
}