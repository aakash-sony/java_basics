
class StaticBlock11 { 
	int x = 10; 
	public static void main(String[] args) 
	{ 
		StaticBlock11 t1 = new StaticBlock11(); 
		System.out.println(t1.x); 
	} 
	static
	{ 
		int x = 20; 
		System.out.print(x + " "); 
	} 
}