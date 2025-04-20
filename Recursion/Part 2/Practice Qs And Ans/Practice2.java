public class Practice2 {
    public static int fact(int a, int n) {
        if (n == 0) {// is it ok to take base condition as if(n==0) or if(n==1)
            return 1;
        }
        if (n % 2 == 0) {
            return fact(a, n / 2) * fact(a, n / 2);
        }
        return a * fact(a, n / 2) * fact(a, n / 2);
    }

    public static void main(String args[]) {
        System.out.println(fact(2, 6));
    }
}