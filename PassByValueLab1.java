 public class PassByValueLab1{

	public static void main(String[] args) 
	{
		 int num = 4;
		 modifyNumber(num);
		 System.out.println(num);   

	}
	public static void modifyNumber(int num)
	{
		num = 8;		
	}
}