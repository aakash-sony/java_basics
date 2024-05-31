class Parent
{
	int num;
	public Parent(int num) {
		this.num=num;
	}
	int get_num()
	{
		return this.num;
	}
}
class Child extends Parent
{
	int val;
	public Child(int num,int val) {
		super(num);
		this.val=val;
	}
	int get_val()
	{
		return this.val;
	}
}
public class ParentDemo
{
   public static void main(String[] args)
   {
	Child son = new Child(100,200);
	System.out.print(son.get_num()+" ");
	System.out.println(son.get_val());
   }
}