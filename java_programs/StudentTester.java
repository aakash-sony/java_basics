import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Science Student name: ");
		String name = sc.nextLine();

		System.out.println("Enter Science Student Class: ");
		String sClass = sc.nextLine();

		System.out.print("Enter physics marks( 0 to 100): ");
		int pMarks = sc.nextInt();

		System.out.print("Enter chemistry marks( 0 to 100): ");
		int chMarks = sc.nextInt();

		System.out.print("Enter math marks( 0 to 100): ");
		int mtMarks = sc.nextInt();

		if (pMarks >= 0 && pMarks <= 100 && chMarks >= 0 && chMarks <= 100 && mtMarks >= 0 && mtMarks <= 100) {
			ScienceStudent ss = new ScienceStudent(name, sClass, pMarks, chMarks, mtMarks);
			
			System.out.println("Student Percentage: " + ss.getPercentage());
		}
		else
		{
			System.out.println("Invalid marks!");
			return;
		}
		
		System.out.println("Enter History Student name: ");
		String hName = sc.nextLine();
		hName = sc.nextLine();

		System.out.println("Enter History Student Class: ");
		String hClass = sc.nextLine();

		System.out.print("Enter history marks: ");
		int hMarks = sc.nextInt();

		System.out.print("Enter civics marks: ");
		int cvMarks = sc.nextInt();

		if(hMarks >= 0 && hMarks <= 100 && cvMarks >= 0 && cvMarks <= 100)
		{
			HistoryStudent hs = new HistoryStudent(hName, hClass, hMarks, cvMarks);
			System.out.println("Student Percentage: " + hs.getPercentage());
			
		}
		else
		{
			System.out.println("Invalid marks!");
			return ;
		}
		System.out.println("------------------------------");
		System.out.println("Total student: " + Student.getTotalNoStudents());

	}

}

abstract class Student {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents = 0;

	public Student() {
		super();
	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}

	abstract public int getPercentage();

	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}

}

class ScienceStudent extends Student {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;

	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		
		return (physicsMarks + chemistryMarks + mathsMarks) / 3;
	}
}

class HistoryStudent extends Student {

	private int historyMarks;
	private int civicsMarks;

	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() {

		return (historyMarks + civicsMarks) / 2;
	}

}
