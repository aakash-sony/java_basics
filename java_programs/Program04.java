import java.io.FileOutputStream;
import java.io.IOException;

public class Program04 {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C:\\Users\\Dell\\Desktop\\File_Handling\\class02.txt");
		try(f) {
			String s = "OOP concept completed in core java class.";
			byte[] b = s.getBytes();
			f.write(b);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Successfully written in file.");
	}
}
