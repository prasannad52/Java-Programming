
public class SuperKeyword {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.color);
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("eats");
    }
}

class Dog extends Animal {

    Dog() {
        super.color = "Brown";
    }
}
