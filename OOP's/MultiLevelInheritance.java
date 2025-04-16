
public class MultiLevelInheritance {

    public static void main(String[] args) {
        Dog Julie = new Dog();
        Julie.legs = 4;
        Julie.color = "Gray";
        Julie.breed = "Julie";
        System.out.println(Julie.color + " " + Julie.legs + " " + Julie.breed);
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

class Dog extends Mammal {

    String breed;
}
