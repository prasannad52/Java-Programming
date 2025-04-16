
public class Constructor {

    public static void main(String[] args) {
        Student obj = new Student("Prasanna");
        System.out.println(obj.name);
    }
}

class Student {

    String name;
    int age;

    Student(String name) {
        this.name = name;
    }
}
