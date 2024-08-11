import java.io.File;

//Checking the file is existing or not with 'exists' method...
public class Program03 {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Dell\\Desktop\\File_Handling\\class02.txt");
			
			if (f.exists()) {
				System.out.println("File is already exist..");
				System.out.println("File name: " + f.getName());
				System.out.println("File location: " + f.getAbsolutePath());
				System.out.println("File readable: " + f.canRead());
				System.out.println("File writable: " + f.canWrite());
				System.out.println("File size: " + f.length());
			} else {
				f.createNewFile();
				System.out.println("File " + f.getName() + " successfully created.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
