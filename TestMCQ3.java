class Some {
int i = 10;
void m1() {
System.out.println("Some "+this.i);
}
}
class Thing extends Some {
int i = 20;
Some s = new Some();
}
public class TestMCQ3 {
public static void main(String[] args) {
Thing t = new Thing();
t.s.m1();

}
}