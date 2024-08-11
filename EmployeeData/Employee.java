/*
Create a BLC class Employee class with properties 

private String firstName
private String lastName
private int employeeId
private double salary
private int noOfProject


Create a setEmployeeData() method with 5 parameters to initialize all the instance variables.

Implement calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.

NoOfProject is more than 5 and less that 10 then add 5000.
NoOfProject is more than 10 and less that 20 then add 10000.
NoOfProject is more than 20 then add 15000. 	

 Take a method called displayDetails() to display the salary.

 Take an ELC class Tester to test your logic.
-----------------------------------------------------------------------------------------------------
*/

public class Employee
{
     private String firstName;
     private String lastName;
     private int employeeId;
     private double salary;
     private int noOfProject;
     private double finalSalary;

     public void setEmployeeData(String firstName, String lastName, int employeeId, double salary,                                                                                      int noOfProject)
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.employeeId = employeeId;
      this.salary = salary;
      this.noOfProject = noOfProject;
    }

    public void displayEmployeeDetails()
    {
       System.out.println("Employee Name: "+firstName+" "+lastName);
       System.out.println("Employee Id: "+employeeId);
       System.out.println("Employee Salary: "+salary);
       System.out.println("Project Done: "+noOfProject);
       System.out.println("Employee Total Salary: "+finalSalary);
    }

    public void calculateSalary()
    {
	if(noOfProject > 5 && noOfProject <= 10)
	{
	    finalSalary = salary + 5000;
	}
        else if(noOfProject > 10 && noOfProject <= 20)
	{
	    finalSalary = salary + 10000;
	}
	else
	{
	    finalSalary = salary + 15000;
	}
	
    }

}










