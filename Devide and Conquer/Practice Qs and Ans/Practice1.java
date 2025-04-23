import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 1;
        int num[] = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
        long number = 0;
        for (int i = 0; i < num.length; i++) {
            int rem = num[i];
            number = number * 10 + rem;
        }
        System.out.println(number);
        long res = number + k;
        String strres = Long.toString(res);
        for (int i = 0; i < strres.length(); i++) {
            char j = strres.charAt(i);
            list.add(j - '0');
        }
        System.out.println(list);
    }
}