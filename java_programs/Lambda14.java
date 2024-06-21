
interface BiFunction<T, U, R> 
{
    R apply(T t, U u);
}

public class Lambda14
{
  public static void main(String[] args) 
  {
        // BiFunction to concatenate two strings
    BiFunction<String, String, String> concatenateStrings = (str1, str2) -> str1 + str2;

        String result = concatenateStrings.apply("Hello", " Java");
        System.out.println(result);  


      // BiFunction to find the length two strings
    BiFunction<String, String, Integer> concatenateLength = (str1, str2) -> str1.length() + str2.length();

        Integer result1 = concatenateLength.apply("Hello", "Java");
        System.out.println(result1);  
  }
}