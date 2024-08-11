public class PalindromeLab
{
    public static void main(String args[])
    {
        int count = 0, temp, rev = 0;
        int num = Integer.parseInt(args[0]);
        if(num <= 0)
        {
            System.out.println("the given number is zero or -ve kindly provide the +ve number.");
            return;
        }
        temp = num;
        while(num != 0)
        {
            count++;
            num = num / 10;
        }
        num = temp;
        if(count == 3)
        {
            while(temp != 0)
            {
                int r = temp % 10;
                rev = rev * 10 + r;

            }
            if(rev == num)
            {
            System.out.println("the number is palindrome.");
            }
            else
            {
                System.out.println("the number is not a palindrome.");
            }
        }
        else
        {
            System.out.println("the program can work for the 3 digit number only.");
        }


    }
}