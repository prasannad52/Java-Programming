// Prefix array alog (imp)

public class Prefixarray {

    public static int result(int number[]) {
        int prefix[] = new int[number.length];
        int max = Integer.MIN_VALUE;
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = number[i] + prefix[i - 1];
        }
        for (int start = 0; start < number.length; start++) {
            for (int end = start; end < number.length; end++) {
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        System.out.println(result(number));
    }
}
