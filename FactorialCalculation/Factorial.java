public class Factorial //BLC
{
    int number;
    public void getFactorial()
    {
        int fact = 1;
        int temp = number;
        while(number != 0)
        {
	    fact = fact * number;
	    number--;
        }
       System.out.println("Factorial of "+temp+" is: "+fact);
    }
}