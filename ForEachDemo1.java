import java.util.Arrays;

public class ForEachDemo1 
{
	public static void main(String[] args) 
	{
		int []values = {90,67,88,12,9};
		
		Arrays.sort(values);
		
		for(int value : values)
		{
			System.out.println(value);
		}

	}

}