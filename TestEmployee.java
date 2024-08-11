class Employee
{
	final int EMPID; //Blank final variable

     Employee()
	{
		EMPID = 101;
	}

   Employee(int id)
	{
		EMPID = id;
	}
}


public class TestEmployee 
{		
	public static void main(String[] args) 
	{ 
	  Employee e1 = new Employee();  //e1 - EMPID = 101
	  Employee e2 = new Employee(102);  //e2 - EMPID = 102 
          System.out.println(e1.EMPID);
	  System.out.println(e2.EMPID);

	}
	
}