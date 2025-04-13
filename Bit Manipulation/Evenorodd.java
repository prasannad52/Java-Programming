
public class Evenorodd {

    public static void main(String[] args) {
        int n = 0;
        if ((n & 1) == 0) {// here 1 is called as bitmask
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
