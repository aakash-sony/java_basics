class CreatingMultipleObject
{
int a=10;
int b=20;
public static void main(String[] args)
{
CreatingMultipleObject e1=new CreatingMultipleObject();
CreatingMultipleObject e2=new CreatingMultipleObject();
System.out.println(e1.a+". .."+e1.b);
System.out.println(e2.a+". .."+e2.b);
e1.a=50;
e2.b=60;
System.out.println(e2.a+". .."+e2.b);
System.out.println(e2.a+". .."+e2.b);
}
}