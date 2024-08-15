import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
record Student(String name, String course)
{
}

public class StreamProgram03 {

	public static void main(String[] args) {
		List<Student> studentDetails = new ArrayList<Student>();
		studentDetails.add(new Student("Alice", "Java"));
		studentDetails.add(new Student("Smith","Java"));
		studentDetails.add(new Student("Scott", "C++"));
		studentDetails.add(new Student("Blake", "Java"));
		studentDetails.add(new Student("King", "React"));
		
		studentDetails.stream().filter(course -> course.course().equals("Java")).map(name -> name.name()+" ").collect(Collectors.toList()).forEach(System.out::print);

	}

}