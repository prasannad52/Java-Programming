
import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(isPalindrome(word));
    }
}
