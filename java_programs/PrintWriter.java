//PrintWriter 
import java.io.*;
public class PrintWriter
{
  public static void main(String[] args) throws IOException
	{
	  PrintWriter writeData = new PrintWriter("C:\\Users\\Dell\\Desktop\\File_Handling\\class03.txt");

     try(writeData)
	 {      
      int roll = 15;
      //Writing primitive data into text format
      writeData.printf("My roll number is : %d ", roll);    
    }
    catch(Exception e) 
	{
      e.printStackTrace();
    }
  }
}