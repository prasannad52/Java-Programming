
public class Abstraction {

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eats();
        chicken c1 = new chicken();
        c1.walk();
        c1.eats();
        h1.changeColor("red");
        System.out.println(h1.color);
    }
}

abstract class Animal {

    String color;

    Animal() {// every animal automatically defined by color brown if we explicitely mention the color
        color = "Brown";
    }

    void eats() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk() {
        System.out.println("walks on 4 legs");
    }

    void changeColor(String color) {
        this.color = color;
    }
}

class chicken extends Animal {

    void walk() {
        System.out.println("walks on 2 legs");
    }

    void changeColor(String color) {
        this.color = color;
    }
}
