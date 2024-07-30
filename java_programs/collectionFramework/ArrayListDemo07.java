import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

record Professor(String name, String specialization)
{
}

class Department 
{
    private String name;
    private final List<Professor> professors; // Department "HAS-A" relationship with Professor

    public Department(String name) 
    {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor prof) 
    {
        professors.add(prof);
    }

    public String getName() 
    {
        return this.name;
    }

    public List<Professor> getProfessors() 
    {
        return professors;
    }
}

public class ArrayListDemo07
{
    public static void main(String[] args) 
    {
    	
        Professor prof1 = new Professor("Scott", "Java");
        Professor prof2 = new Professor("Rahul", "Python");
        Professor prof3 = new Professor("Samir", ".Net");
        
        Department csd = new Department("Computer Science");
        csd.addProfessor(prof1);
        csd.addProfessor(prof2);
        csd.addProfessor(prof3);
        
        // Accessing properties through the "HAS-A" relationship
        System.out.println("Department Name: " + csd.getName());

        System.out.println("Professors in " + csd.getName() + ":");
               
        List<Professor> professors = csd.getProfessors(); 
        professors.forEach(System.out::println);
        
        
    }
}