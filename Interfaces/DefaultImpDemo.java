interface Animal {
    void makeSound();
    default void eat() {
        System.out.println("Eating");
    }
    static void clean() {
        System.out.println("Cleaning");
    }
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Wuf-wuff !");
    }
}

public class DefaultImpDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();
        Animal.clean();
    }
}
q