import java.io.File;
import java.io.IOException;

//Create a directory/folder on specific location..
public class Program01 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Dell\\Desktop\\File_Handling");
		if (f.mkdir()) {
			System.out.println("Folder is successfully created....");
			System.out.println("Folder name: " + f.getName());
			System.out.println("Folder location: " + f.getAbsolutePath());
		} else {
			System.out.println("Folder is already created..");
		}

	}

}
