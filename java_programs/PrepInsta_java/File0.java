import java.io.*;  
public class File0 
	{
		public static void main(String[] args) 
		{
			try 
				{
					File f = new File("C:\\Users\\Dell\\Desktop\\java_basics\\java_programs\\Batch33.txt");

                    if(f.exists())
					{
						System.out.println("File is existing");
					}
					else
					{
						System.out.println("File is not existing");
					}

					if (f.createNewFile())
					   {
						 System.out.println("File created: " + f.getName());
                       }
					   else  
						{
                             System.out.println("File is already existing....");
                         }								  
                  }
				 catch (IOException e)
                 {
					System.err.println(e);
				} 
		}
}