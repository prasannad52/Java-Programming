import java.util.*;

class DuplicateParantheses {
    public static boolean isValid(String str1) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // closing condition
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplciate parantheses
                } else {
                    s.pop();// parantheses matched
                }
            } else {// opening condition
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // the given string is already an valid string
        String str1 = "(1-3)";// false
        String str2 = "((2*(7-8)))";// true
        System.out.println(isValid(str1));
    }
}