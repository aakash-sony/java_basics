class Vehicle {
Vehicle() {
honk().display();
}

public Vehicle honk() {
    System.out.println("Vehicle is honking");
    return this;
}

public void display() {
    honk();
}
}

class BMW extends Vehicle {
BMW() {
honk().display();
}

public Vehicle honk() {
    System.out.println("BMW is honking");
    return this;
}

public void display() {
    honk();
}
}

public class TestMCQ2 {
public static void main(String[] args) {
Vehicle v = new BMW();

}
}