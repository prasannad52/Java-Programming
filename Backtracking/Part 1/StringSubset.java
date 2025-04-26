public class StringSubset {
    public static void subset(String str, int i, String res) {
        // base case
        if (i == str.length()) {
            if (res.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(res);
            }
            return;
        }
        // yes choice
        subset(str, i + 1, res + str.charAt(i));
        // no choice
        subset(str, i + 1, res);
    }

    public static void main(String[] args) {
        subset("abc", 0, "");
    }
}