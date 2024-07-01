import java.io.*;
public class FileHandling1
{
     public static void main(String args[]) throws IOException
     {
         var f1 = new FileInputStream("File1.java");
         var f2 = new FileInputStream("File2.java");

         var s = new SequenceInputStream(f1,f2);

		 try(f1; f2; s)
		 {
         int i;
         while(true)
		 {
			  i = s.read();
			   if(i==-1)
				  break;
			  System.out.print((char)i);		 
		 }     
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
     } 
}