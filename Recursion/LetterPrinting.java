
public class LetterPrinting {
    static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void print(int n) {
        if (n == 0) {// base condition
            return;
        }
        int last_digit = n % 10;
        print(n / 10);
        System.out.print(arr[last_digit] + "  ");
    }

    public static void main(String args[]) {
        print(1201);
    }
}