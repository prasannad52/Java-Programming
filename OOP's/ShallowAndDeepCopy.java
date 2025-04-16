
public class ShallowAndDeepCopy {

    public static void main(String[] args) {
        Student s2 = new Student("Prasanna", 20);
        s2.marks[0] = 90;
        s2.marks[1] = 89;
        s2.marks[2] = 90;
        Student s3 = new Student(s2);
        System.out.println(s3.name + " " + s3.age + " " + s3.marks[0]);
    }
}

class Student {

    String name;
    int age;
    int marks[];

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = new int[3];
    }

    Student(Student s1) {
        marks = new int[3];
        this.age = s1.age;
        this.name = s1.name;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
