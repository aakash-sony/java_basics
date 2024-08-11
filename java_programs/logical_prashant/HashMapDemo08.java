import java.util.*;
class Employee
{
	int eid;
	String ename;

	Employee(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

     @Override
	public boolean equals(Object obj)  //obj = e2
	{		
		if(obj instanceof Employee)
        {
			Employee e2 = (Employee) obj; //downcasting

			if(this.eid == e2.eid && this.ename.equals(e2.ename))
			{
				return true;
			}
			else
			{
				return false;
			}
	    }
		else
		{
			System.out.println("Comparison is not possible");
			return false;
		}		
	}

  
	public String toString()
		{
			 return " "+eid+" "+ename;
		}
}
public class HashMapDemo08
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Aryan");
		Employee e2 = new Employee(102,"Pooja");
		Employee e3 = new Employee(101,"Aryan");
		Employee e4 = e2;  

		
		HashMap<Employee,String> hm = new HashMap<>();
		hm.put(e1,"Ameerpet");
		hm.put(e2,"S.R Nagar");
		hm.put(e3,"Begumpet");
		hm.put(e4,"Panjagutta");

		hm.forEach((k,v)-> System.out.println(k+" : "+v));
	}
}