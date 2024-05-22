class BlankFinalDefaultVariable
{
	final int A;
	
	{
		m1();
		A = 100;
	}
	
	public void m1()
	{
		System.out.println(A);  //0
	}
	
}

public class FinalDefaultVariable{

	public static void main(String[] args) 
	{
		System.out.println(new BlankFinalDefaultVariable().A); //100

	}

}