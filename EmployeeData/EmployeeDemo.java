import java.util.Scanner;
public class EmployeeDemo
{
      public static void main(String args[])
      {
          Employee emp = new Employee();
          Scanner sc = new Scanner(System.in);

	  System.out.print("Enter Employee First Name: ");
	  String firstName = sc.nextLine();

	  System.out.print("Enter Employee Last Name: ");
	  String lastName = sc.nextLine();

	  System.out.print("Enter Employee Id: ");
	  int employeeId = sc.nextInt();

	  System.out.print("Enter Employee Salary: ");
	  double salary = sc.nextDouble();

          System.out.print("How many projects have you done: ");
	  int noOfProject = sc.nextInt();

          emp.setEmployeeData(firstName, lastName, employeeId, salary, noOfProject);
          emp.calculateSalary();
          emp.displayEmployeeDetails();
      }
}