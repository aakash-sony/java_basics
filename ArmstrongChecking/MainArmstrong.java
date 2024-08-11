import java.util.Scanner;
public class MainArmstrong
{
    public static void main(String args[])
    {
       Armstrong armstrong = new Armstrong();
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number: ");
        int number = sc.nextInt();

        armstrong.checkArmstrong(number);
    }
}