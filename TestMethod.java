public class TestMethod {  
    public void myMethod()   
    {  
    System.out.println("Method");  
    }  
      
    {  
    System.out.println(" Instance Block");  
    }  
          
    public void Test()  
    {  
    System.out.println("Constructor ");  
    }  

    static {  
        System.out.println("static block");  
    }  
    
	public static void main(String[] args)
	{  
    TestMethod t1 = new TestMethod();  
    t1.Test();
    t1.myMethod();  
  }  
} 