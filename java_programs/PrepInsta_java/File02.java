import java.io.*;
public class File02
{
	public static void main(String args[])
	{
		try{
			File f = new File("C:\\Users\\Dell\\Desktop\\july_02_024.java");
			
			if(f.mkdir())
			{
				System.out.println("File created: "+f.getName());
			}
			else
			{
				System.out.println("File is already existing.");
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}