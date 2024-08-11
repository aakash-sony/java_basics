class NonStaticBlock {
	int a ; 
	NonStaticBlock(){
		System.out.println("Constructor");
}

{
System.out.println("Non-static block");
}

 public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(new NonStaticBlock().a); 
	}
}