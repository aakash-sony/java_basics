class A 
{
   void foo() 
   {
     System.out.println("A");
   }
}

class B extends A 
{
    void foo() 
    {
      System.out.println("B");
    }
}	

class InheritanceA
{
    public static void main(String[] args)
    {
      A obja;
      B objb = new B();
      objb.foo();
      obja = objb;
      obja.foo();
    }
}