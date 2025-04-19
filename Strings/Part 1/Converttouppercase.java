
public class Converttouppercase {

    public static String toUppercase(String str) {
        StringBuilder res = new StringBuilder("");
        res.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                res.append(str.charAt(i));
                i++;
                res.append(Character.toUpperCase(str.charAt(i)));
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am prasanna dindi ";
        System.out.println(toUppercase(str));
    }
}
