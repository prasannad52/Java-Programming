
public class Avgofthree {

    public static int avg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {
        int average = avg(10, 20, 30);
        System.err.println(average);
    }
}
