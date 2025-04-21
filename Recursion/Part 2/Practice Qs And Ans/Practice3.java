public class Practice3 {
    public static void toh(int n, String src, String dest, String temp) {
        if (n == 0) {
            return;
        }
        toh(n - 1, src, temp, dest);
        System.out.println(src + " to " + dest);
        toh(n - 1, temp, dest, src);
    }

    public static void main(String[] args) {
        toh(3, "A", "C", "B");
    }
}