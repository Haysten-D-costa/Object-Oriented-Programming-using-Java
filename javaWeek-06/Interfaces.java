interface Edible {
    String howToEat();
}
abstract class Animal {
    abstract String sound();
}
class Tiger extends Animal {
    String sound() { return "Roar"; }
}
class Cow extends Animal implements Edible {
    public String howToEat() { return "cheese"; }
    String sound() { return "nuuuuh !"; }
}
abstract class Fruit implements Edible {}

class Orange extends Fruit {
    public String howToEat() { return "Orange squash"; }
}
class Apple extends Fruit {
    public String howToEat() { return "Apple cider"; }
}
public class Interfaces {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a.howToEat());
    }
}