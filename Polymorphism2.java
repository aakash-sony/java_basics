public class Polymorphism2 
{
   public static void main(String[] args) 
  {
   A ref1 = new C();
   B ref2 = (B) ref1;
   System.out.println(ref2.g());
  }
}
class A 
{
   private int f() { return 0; }
   public int g() { return 3; }
}
class B extends A
{
   private int f() { return 1; }
   public int g() { return f(); }
}
class C extends B 
{
   public int f() { return 2; }
}