import java.util.*;

public class SwappingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(89);
        list.add(10);
        System.out.println(list);
        int idx1 = 2, idx2 = 3;
        int temp = list.get(idx2);
        list.set(idx2, list.get(idx1));
        list.set(idx1, temp);
        System.out.println(list);
    }
}