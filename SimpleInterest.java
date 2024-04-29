/*
Q) Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and    Amount.
*/
public class SimpleInterest
{
     public static void main(String args[])
     {
        double principal = Double.parseDouble(args[0]);
        double rate= Double.parseDouble(args[1]);
        double time= Double.parseDouble(args[2]);
        
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: "+simpleInterest);
        System.out.println("Total amount: "+(principal + simpleInterest));
     }
}