import java.util.Scanner;
public class CheckingDepartment
{
	static int empId;
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
	
	     System.out.print("Enter the EmpId(10 to 24): ");
	     empId = sc.nextInt();

	     checkingDepart(empId);
	}
	public static void checkingDepart(int id)
	{
	   switch(id)
	   {
		case 10: case 11: case 12: case 13: case 14:
		System.out.println("Software Department."); break;

		case 15: case 16: case 17: case 18: case 19:
		System.out.println("Production Department."); break;

		case 20: case 21: case 22: case 23: case 24:
		System.out.println("Finance Department."); break;

		default:
		System.out.println("Invalid option.");

	   }
	} 
}





