class Parent {
    int x = 10;

    void display() {
        System.out.println("Parent display: " + x);
    }
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child display: " + x);
    }
}

public class MainC {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        System.out.println("Value of x: " + p.x);
    }
}
