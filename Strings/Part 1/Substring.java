
public class Substring {

    public static String isSubstring(String word, int si, int ei) {
        String sub = "";
        for (int i = si; i <= ei; i++) {
            sub += word.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("Hello world", 0, 3));
        String s1 = "Prasanna";
        System.out.println(s1.substring(0, 3));
    }
}
