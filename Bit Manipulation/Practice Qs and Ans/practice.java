
public class practice {

    public static void main(String[] args) {
        String name = "CHETAN";
        for (int i = 0; i < name.length(); i++) {
            System.out.print((char) (name.charAt(i) | 32));
        }
    }
}
