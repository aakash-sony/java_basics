import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriterClass
{
    public static void main(String[] args) throws IOException
	{
        var filename = "C:\\Users\\Dell\\Desktop\\File_Handling\\class02.txt"; 
		//wants to write the data in the existing file
		var fileWriter = new FileWriter(filename, true);

        var bufferedWriter = new BufferedWriter(fileWriter);

        try(fileWriter;bufferedWriter)
		{            
           
            // Append text to the file
            String textToAppend = "My Name is Raj";
            bufferedWriter.write(textToAppend);
            
			//Moving the cursor to the next line
            bufferedWriter.newLine();

            textToAppend = "I lives in hyderabad";
            bufferedWriter.write(textToAppend);
         
            
            System.out.println("Text appended successfully to the file.");
        } 
		catch (IOException e) 
		{
            System.out.println("An error occurred while appending the text to the file: " + e.getMessage());
        }
    }
}