public class AmbiguityIssueRule {
	
	public static void nit(Integer a)
	{
		System.out.println(a);
	}
	
	public static void nit(String b) 
	{
		System.out.println(b);
	}
	
	public static void nit(Object c) 
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		nit(null);
	}
}