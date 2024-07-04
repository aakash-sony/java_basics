import java.io.*;
public class FileWriter1
{
  public static void main(String[] args) throws IOException
	{
       var fr = new FileReader("C:\\Users\\Dell\\Desktop\\File_Handling\\class03.txt");
	   var  fw = new FileWriter("C:\\Users\\Dell\\Desktop\\File_Handling\\class04.txt");
	   
		try(fr;fw)
		{
		     int i;
		    while((i=fr.read())!= -1)
			{
				fw.write(i);
			}
		}
		catch(Exception e)
		{
		}
		System.out.println("Success");
    }
}