import java.util.Scanner;


abstract class Book {
	String title;

	public Book(String title) {
		this.title = title;
	}

	abstract void setTitle(String title);

	public String getTitle() {
		return title;
	}

}

class MyBook extends Book {

	public MyBook(String title) {
		super(title);
	}

	@Override
	void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

}



public class BookTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name: ");
		String name = sc.nextLine();
		MyBook mb = new MyBook(name);
		System.out.println("Title of my book: " + mb.getTitle());

		sc.close();
	}

}
