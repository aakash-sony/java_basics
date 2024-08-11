class A
{
    public int m1() 
    {
        return 20;
    }
}
class B extends A 
{
    public int  m1() 
    {
        return 30;
    }
    public int m2() 
    {
        return 40;
    }
}
class C extends B
{
    public int m2() 
    {
        return 20;
    }
}
class MethodOverriding
{
       public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		System.out.println(obj1.m1() + obj3.m1() + obj3.m2());
	}
}