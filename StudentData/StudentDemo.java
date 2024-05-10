import java.util.Scanner;

public class StudentDemo
{
     public static void main(String args[])
     {
        Student s = new Student();
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter student name: ");
	String studentName = sc.nextLine();

	System.out.print("Enter student ID: ");
	int studentId = sc.nextInt();

	System.out.print("Enter student marks: ");
	int marks = sc.nextInt();
	
	s.setStudentData(studentId, studentName, marks);
	s.calculateGrade();
	s.studentDetails();
     }
}