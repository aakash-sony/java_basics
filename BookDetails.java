/*
Q) Write A programs on OOPs by your own thinking and imagination.
-----------------------------------------------------------------
*/
import java.util.Scanner;
class Book
{
   String bookName;
   String bookAuthor;
   String bookFeedback;

   public void getBookInformation()
   {
      System.out.println("Book name: "+bookName);
      System.out.println("Author name: "+bookAuthor);
   }
   public void getFeedBack()
   {
      System.out.println("Book Feedback: "+bookFeedback);
   }

}
public class BookDetails
{
    public static void main(String args[])
    {
      Book book = new Book();
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Book name: ");
      book.bookName = sc.nextLine();

      System.out.print("Enter Book author name: ");
      book.bookAuthor = sc.nextLine();

      System.out.print("Enter your feedback(Good/Poor/Average): ");
      book.bookFeedback = sc.nextLine();

      book.getBookInformation();
      book.getFeedBack();

    }
}
