import java.io.*;
public class File03
{
      public static void main(String args[]) throws IOException
      {
           var fin = new FileInputStream("C:\\Users\\Dell\\Desktop\\july_02_024.java");
           var bin = new BufferedInputStream(fin);

		   try(fin ; bin)
		   {
           int i;
           while((i = bin.read()) != -1)
           {
                System.out.print((char)i); 
           }
           }
		   catch(IOException e)
		  {
			   e.printStackTrace();
		  }
		  System.out.println();
      }
}