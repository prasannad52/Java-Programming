import java.util.*;

//bruteforce approach
public class PairSumSortedARotated {
    public static boolean mostwater(ArrayList<Integer> list, int target) {
        int br = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                br = i;
                break;
            }
        }
        int lp = br + 1;
        int rp = br;
        while (lp != rp) {
            // this is very important use this condition every time
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(mostwater(list, 16));
    }
}
