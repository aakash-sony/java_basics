public class AutoBoxingDemo {

	public static void main(String[] args) 
	{
		byte a = 12;
		Byte b =  Byte.valueOf(a);
		System.out.println("Byte Object :"+b);
		
		short c = 24;
		Short d = Short.valueOf(c);
		System.out.println("Short Object :"+d);
		
		int e = 90;
		Integer f = Integer.valueOf(e);
		System.out.println("Integer Object :"+f);
		

		long g = 12;
		Long h =  Long.valueOf(g);
		System.out.println("Long Object :"+h);
		
		float i = 2.4f;
		Float j = Float.valueOf(i);
		System.out.println("Float Object :"+j);
		
		double k = 90.90;
		Double l = Double.valueOf(k);
		System.out.println("Double Object :"+l);
		
		char ch = 'A';
		Character ch1 = Character.valueOf(ch);
		System.out.println("Character Object :"+ch1);
		
		boolean b1 = true;
		Boolean x = Boolean.valueOf(b1);
		System.out.println("Boolean Object :"+x);

	}
}