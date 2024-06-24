class NonStaticExecution 
{
	NonStaticExecution()
	{
		System.out.println("Object initialization process....");
	}
 
	{
		System.out.println("Object creation process....");
	}
 
	public static void main(String[] args) 
	{
		new NonStaticExecution(); 
		new NonStaticExecution();
		new NonStaticExecution();
	}
}