
public class Uppercasetolowercase {

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) (i | 32) + "  ");// 32 is the aascii value of the space
        }
        System.out.println((int) ' ');// check it out
    }
}
