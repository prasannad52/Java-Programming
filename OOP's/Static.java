
public class Static {

    public static void main(String[] args) {
        Student s1 = new Student("Prasanna", 20);
        s1.college_name = "DR.AIT";
        System.out.println(s1.name + "  " + s1.age + "  " + s1.college_name);
        Student s2 = new Student("Chetan", 20);
        System.out.println(s2.college_name);
    }
}

class Student {

    String name;
    int age;
    static String college_name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
