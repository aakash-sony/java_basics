class Car {
public int carNumber = 1234;

void start() {
    System.out.println("Car started");
}

protected void stop() {
    System.out.println("Car stopped");
}
}

class Audi extends Car {
protected int carNumber = 4321;

protected void start() {
    System.out.println("Audi started");
}

public void stop() {
    System.out.println("Audi stopped");
}
}

public class TestMCQ {
public static void main(String[] args) {
Car c = new Audi();
c.start();
c.stop();
System.out.println(c.carNumber);
}
}