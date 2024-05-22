public class CalculateStudentGrade 
{
    
	public static StudentGrade calculateGrade(Student s)
    {
    	int studentMarks = s.getStMarks();
    	if(studentMarks > 90 && studentMarks <= 100)
    	{
    		return new StudentGrade(s,'A');
    	}
    	else if(studentMarks >= 75)
    	{
    		return new StudentGrade(s,'B');
    	}
    	else if(studentMarks >= 60)
    	{
    		return new StudentGrade(s,'C');
    	}
    	else 
    	{
    		return new StudentGrade(s,'D');
    	}
    	
    	
    }
}
