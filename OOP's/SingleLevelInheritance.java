
public class SingleLevelInheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.breathe();
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

class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
