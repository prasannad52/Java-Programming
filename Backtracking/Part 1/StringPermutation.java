public class StringPermutation {
    public static void permuation(String str, String res) {
        // base case
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        // kaam
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permuation(newStr, res + cur);// backtracking
        }
    }

    public static void main(String[] args) {
        permuation("abc", "");
    }
}