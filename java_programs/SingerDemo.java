public class SingerDemo extends Singer
 {
  public static String sing() 
  {
    return "fa";
  }

  public static void main(String[] args) 
  {
    SingerDemo t = new SingerDemo();
    SingerDemo s = new SingerDemo();
    System.out.println(t.sing() + " " + s.sing());
  }
}

class Singer {
  public static String sing() {
    return "la";
  }
}