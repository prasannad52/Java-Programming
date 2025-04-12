
public class Swap {

    public static void swaping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swaping(a, b);
        System.out.println("a:" + a + "  b:" + b);// Java is always pass by value programming language
    }
}
