
public class MethodOverriding {

    public static void main(String[] args) {
        Animal s1 = new Animal();
        s1.eat();
        Dog s2 = new Dog();
        s2.eat();
    }
}

class Animal {

    String color;

    void breathe() {
        System.out.println("breathes");
    }

    void eat() {
        System.out.println("eats");
    }
}

class Dog extends Animal {

    String breed;

    void eat() {
        System.out.println("dog eats");
    }
}
