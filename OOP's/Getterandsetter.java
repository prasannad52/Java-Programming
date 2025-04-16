
public class Getterandsetter {

    public static void main(String[] args) {
        Pen obj1 = new Pen();
        obj1.setColor("blue");
        System.out.println(obj1.getColor());
    }
}

class Pen {

    private String color;
    private int tip;

    String getColor() {
        return this.color; //this pointing to the current object
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
