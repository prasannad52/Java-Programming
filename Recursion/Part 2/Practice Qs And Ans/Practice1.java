public class Practice1 {
    public static int fact(int n) {
        if (n == 0) {// is it ok to take base condition as if(n==0) or if(n==1)
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String args[]) {
        System.out.println(fact(5));
    }
}