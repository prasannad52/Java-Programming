
public class Stringbuilderexa {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");// check this bro StringBuilder here S and B are capital
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
