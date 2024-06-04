class Base {
Base() {
this(10);
}

Base(int a) {
    m1(a);
}

void m1(int a) {
    System.out.println(a);
}
}

class Derived extends Base {
Derived() {
this(20);
}

Derived(int a) {
    m1(a);
}

void m1(int a) {
    System.out.println(a);
}
}

public class TestMCQ4 {
public static void main(String[] args) {
Derived d = new Derived();

}
}