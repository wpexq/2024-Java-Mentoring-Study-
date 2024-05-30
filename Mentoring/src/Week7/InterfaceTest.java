package Week7;

interface Animal {
    public abstract void cry();
}

class Cat implements Animal {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog implements Animal {
    public void cry() {
        System.out.println("멍~~ 멍");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.cry();
        dog.cry();
    }
}
