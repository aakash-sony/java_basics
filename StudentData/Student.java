public class Student
{
    private int studentId;
    private String studentName;
    private int marks;
    private char grade;

	public void setStudentData(int studentId, String studentName, int marks)
	{
	  this.studentId = studentId;
	  this.studentName = studentName;
	  this.marks = marks; 
	}

	public void studentDetails()
	{
	   System.out.println("----------------------------");
	   System.out.println("Student Name: "+studentName);
	   System.out.println("Student ID: "+studentId);
	   System.out.println("Student Marks: "+marks);
	   System.out.println("Student Grade: "+grade);   
	}

	public void calculateGrade()
	{
	   if(marks > 90)
	   {
	      grade = 'A';
	   }
	  else if(marks > 80 && marks <= 90)
	   {
	     grade = 'B';
 	   }
	  else if(marks > 70 && marks <= 80)
	  {
	     grade = 'C';
	  }
	 else if(marks > 60 && marks <= 70)
	  {
	     grade = 'D';
	  }
	 else
	 {
	    grade = 'E';
	 }

      } 
}







