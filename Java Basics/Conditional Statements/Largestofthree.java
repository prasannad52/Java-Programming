
public class Largestofthree {

    public static void main(String[] args) {
        int a = 20, b = 10, c = 30;
        if (a >= b && a >= c) {
            System.out.println("a is largest of three");
        } else if (b >= c) {
            System.out.println("b is largest of three");
        } else {
            System.out.println("c is largest of three");
        }
    }
}
