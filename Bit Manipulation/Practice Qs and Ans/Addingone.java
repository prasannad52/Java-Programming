
public class Addingone {

    public static void main(String[] args) {
        int x = 10;
        x = ~(~x);
        x = (~x);
        System.out.println((int) Math.abs(x));//check it bro it is coming as -ve so i made it s abslute
    }
}
