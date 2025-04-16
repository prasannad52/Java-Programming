
public class Basic {

    public static void main(String[] args) {
        Pen obj1 = new Pen();
        obj1.color = "Blue";
        System.out.println(obj1.color);
        Student obj2 = new Student();
        obj2.age = 20;
        System.out.println(obj2.age);
        int marks[] = {89, 88, 78};
        System.out.println(obj2.calPercentage(marks));
    }
}

class Pen {

    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}

class Student {

    String name;
    int age;

    float calPercentage(int marks[]) {
        return (marks[0] + marks[1] + marks[2]) / 3;
    }
}
