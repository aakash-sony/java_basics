public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		Runnable nit = () -> System.out.println("Thread Started");
		nit.run();
	}
}