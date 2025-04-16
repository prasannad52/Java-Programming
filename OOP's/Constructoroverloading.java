
public class Constructoroverloading {

    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student("Prasanna");
        Student obj3 = new Student(23);
        System.out.println(obj2.name);
        System.out.println(obj3.age);
    }
}

class Student {

    String name;
    int age;

    Student() {
        System.out.println("Constructor is called.....");
    }

    Student(int age) {
        this.age = age;
    }

    Student(String name) {
        this.name = name;
    }
}
