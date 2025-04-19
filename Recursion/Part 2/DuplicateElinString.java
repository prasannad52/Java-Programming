public class DuplicateElinString {
    public static void duplicate(String str, int n, StringBuilder newStr, boolean map[]) {
        if (n == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(n) - 'a'] == true) {
            // duplicate element
            duplicate(str, n + 1, newStr, map);
        } else {
            // new element
            map[str.charAt(n) - 'a'] = true;
            duplicate(str, n + 1, newStr.append(str.charAt(n)), map);
        }
    }

    public static void main(String[] args) {
        String str = "prasanna";
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}