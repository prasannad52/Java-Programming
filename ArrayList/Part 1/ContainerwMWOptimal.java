import java.util.*;

//bruteforce approach
public class ContainerwMWOptimal {
    public static int mostwater(ArrayList<Integer> list) {
        int mostWater = 0;
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            // calculate maxWater
            int ht = Math.min(list.get(rp), list.get(lp));
            int wt = rp - lp;
            int area = ht * wt;
            mostWater = Math.max(mostWater, area);

            // update condition
            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp++;
            }
        }
        return mostWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println(mostwater(list));
    }
}
