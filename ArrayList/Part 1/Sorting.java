import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(89);
        list.add(10);
        System.out.println(list);// normal printing
        Collections.sort(list);
        System.out.println(list);// ascending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}