import java.util.Scanner;
public class AreaDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a side: ");
		double side = sc.nextDouble();

		Area.areaPrinting(side);

		System.out.println("Enter length: ");
		double length = sc.nextDouble();

		System.out.println("Enter breadth: ");
		double breadth = sc.nextDouble();

		Area.areaPrinting(length, breadth);

		sc.close();
	}
}
