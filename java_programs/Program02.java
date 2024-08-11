import java.io.File;
import java.io.IOException;

//Create a file inside the directory/Folder...
public class Program02 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Dell\\Desktop\\File_Handling\\class01.txt");
			
			if (f.createNewFile()) {
				System.out.println("File is successfully created....");
				System.out.println("File Name: " + f.getName());
				System.out.println("File Location: " + f.getAbsolutePath());
			} else {
				System.out.println("File is already created..");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
