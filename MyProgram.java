import java.util.Scanner;
class MyProgram
{
    private String name;
    private int age;
    private int marks1;
    private int marks2;
    private int marks3;
    private int maximumMarks;
    private float average;
    
    public MyProgram(int age, String name, int marks1, int marks2, int marks3)
    {
        this.name = name;
        this.age = age; 
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter First Subject marks: ");
        int marks1 = sc.nextInt();
        
        System.out.print("Enter Second Subject marks: ");
        int marks2 = sc.nextInt();
        
        System.out.print("Enter Third Subject marks: ");
        int marks3 = sc.nextInt();
        
        MyProgram m = new MyProgram(age, name, marks1, marks2, marks3);
        m.displayDetails();
        
    }
    
    public int findMaximum(int marks1, int marks2, int marks3)
    {
        if(marks1 >= marks2 && marks1 >= marks3)
        {
            maximumMarks = marks1;
        }
        else if(marks2 >= marks3)
        {
            maximumMarks = marks2;
        }
        else
        {
            maximumMarks = marks3;
        }
        return maximumMarks;
    }
    
    public float findAverage(int marks1, int marks2, int marks3)
    {
        int sum;
        sum = marks1 + marks2 + marks3;
        average = (float)sum / 3;
        return average;
    }
    
    public void displayDetails()
    {
        System.out.println("**********************");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks in First Subject: "+marks1);
        System.out.println("Marks in Second Subject: "+marks2);
        System.out.println("Marks in Third Subject: "+marks3);
        int maximum = findMaximum(marks1, marks2, marks3);
        System.out.println("Maximum Marks: "+maximum);
        float average = findAverage(marks1, marks2, marks3);
        System.out.println("Average Marks of subjects: "+average);
        
    }
    
}