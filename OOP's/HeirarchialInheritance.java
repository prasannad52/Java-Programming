
public class HeirarchialInheritance {

    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.breathe();
        Fish shark = new Fish();
        shark.fins = 5;
        shark.eat();
        System.out.println(shark.fins);
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

class Mammal extends Animal {

    int legs;
}

class Bird extends Animal {

    void fly() {
        System.out.println("flies");
    }
}

class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
