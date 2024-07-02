import java.io.*;
public class File01
{
	public static void main(String args[])
	{
		try{
			File f = new File("C:\\Users\\Dell\\Desktop\\july_02.java");
			
			if(f.exists())
			{
				System.out.println("File is existing.");
			}
			else
			{
				System.out.println("File is not existing");
			}
			if(f.createNewFile())
			{
				System.out.println("File created: "+f.getName());
			}
			else
			{
				System.out.println("File is already existing.");
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}