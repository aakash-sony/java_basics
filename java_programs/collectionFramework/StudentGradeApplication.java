import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentGradeApplication {

	static Map<String, String> gradeBook = new HashMap<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addStudentGrade(sc);
				break;
			case 2:
				removeStudentGrade(sc);
				break;
			case 3:
				System.out.println("Successfully terminated...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input...");
			}
		}

	}

	public static void showMenu() {
		System.out.println("***********Menu**********");
		System.out.println("\t1. Add Student Grade");
		System.out.println("\t2. Remove Student Grade");
		System.out.println("\t3. Exit");
	}

	public static void addStudentGrade(Scanner sc) {
		System.out.println("Enter the name: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter the student grade: ");
		String grade = sc.nextLine();

		gradeBook.put(name, grade);
		System.out.println("Grade has been added for the student..");
		System.out.println("\n******-----Grade Book-----******");
		System.out.println("==========================");
		for(Entry<String, String> c:gradeBook.entrySet())
		{
			System.out.println(c.getKey()+" "+c.getValue());
		}
	}

	public static void removeStudentGrade(Scanner sc) {
		if (gradeBook.isEmpty()) {
			System.out.println("Record is empty");

		} else {
			System.out.println("Enter the name to remove: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			if (gradeBook.containsKey(name)) {
				gradeBook.remove(name);
				System.out.println(name + "Successfully removed..");

			}
			else
			{
				System.out.println("Name is not available...");
			}
		}

	}
}
