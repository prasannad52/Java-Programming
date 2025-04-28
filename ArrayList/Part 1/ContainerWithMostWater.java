import java.util.*;

//bruteforce approach
public class ContainerWithMostWater {
    public static int mostwater(ArrayList<Integer> list) {
        int water = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int weidth = j - i;
                int height = Math.min(list.get(i), list.get(j));
                water = Math.max(water, height * weidth);
            }
        }
        return water;
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
