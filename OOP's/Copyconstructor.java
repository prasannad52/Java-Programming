
public class Copyconstructor {

    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student("Prasanna");
        Student obj3 = new Student(23);
        obj2.marks[0] = 90;
        obj2.marks[1] = 100;
        obj2.marks[2] = 80;
        System.out.println(obj2.name);
        System.out.println(obj3.age);
        Student obj4 = new Student(obj2);
        System.out.println(obj4.age + "  " + obj4.name + "  " + obj4.marks[0]);
        obj2.marks[0] = 100;
        System.out.println(obj4.age + "  " + obj4.name + "  " + obj4.marks[0]);
    }
}

class Student {

    String name;
    int age;
    int marks[];

    // Shallow copy constructor
    Student(Student obj) {
        marks = new int[3];
        this.age = obj.age;
        this.name = obj.name;
        this.marks = obj.marks;
    }

    Student() {
        System.out.println("Constructor is called.....");
    }

    Student(int age) {
        this.age = age;
    }

    Student(String name) {
        this.name = name;
        this.marks = new int[3];
    }
}
