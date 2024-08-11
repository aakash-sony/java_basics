enum MyType 
{
ONE 
{
	@Override
    public String toString() 
	{
        return "this is one";
    }
},
 
TWO 
{
	@Override
    public String toString() 
	{
        return "this is two";
    }
}
}
public class Enum3
{
	public static void main(String[] args) 
	{
		System.out.println(MyType.ONE); //Passing Object ref
		System.out.println(MyType.TWO); //Passing Object ref
		
	}
}