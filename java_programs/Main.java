class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
	void bark() {
        System.out.println("Animal is speaking");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }
    void bark() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
