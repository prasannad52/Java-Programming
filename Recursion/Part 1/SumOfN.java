
public class SumOfN {

    public static int Sum(int n) {
        if (n == 0) {
            return 1;
        }
        return n + Sum(n - 1);// also we can write it as:
        //fn-1 = fact(n-1)
        //fn = n + fn-1
        //return fn;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
