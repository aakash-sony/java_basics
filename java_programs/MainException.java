public class MainException {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}