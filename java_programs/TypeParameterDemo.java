
class Accept<T>
{
	private T x;

	public Accept(T x)
	{
		super();
		this.x = x;
	}

	public T getX() 
	{
		return x;
	}	
}
class Student
{
	private int studentId;

	public Student(int studentId) 
	{
		super();
		this.studentId = studentId;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + "]";
	}	
}

public class TypeParameterDemo
{
	public static void main(String[] args) 
	{
		Accept<Integer> intType = new Accept<Integer>(12);
		System.out.println("Integer type :"+intType.getX());
		
	   Accept<Double> doubleType = new Accept<Double>(12.90);
	   System.out.println("Double type :"+doubleType.getX());
		
	   Accept<Boolean> booleanType = new Accept<Boolean>(true);
	   System.out.println("Boolean type :"+booleanType.getX());	
	   
	   Accept<Student> studType = new Accept<Student>(new Student(111));
	   System.out.println("Student type :"+studType.getX());
		
	}

}

