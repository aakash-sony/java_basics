public class ExceptionExample9 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two integers as command-line arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as command-line arguments.");
        } finally {
            System.out.println("End of program.");
        }
    }
}