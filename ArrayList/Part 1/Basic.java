import java.util.*;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();// initialization of arraylist
        // .add()
        list.add(7);// inserting the element in the array list
        list.add(8);
        list.add(9);

        // another add()
        list.add(1, 9);

        // printing
        System.out.println(list);

        // .get()
        System.out.println(list.get(0));

        // .remove()
        list.remove(0);
        System.out.println(list);

        // .contains()
        System.out.println(list.contains(1));
        System.out.println(list.contains(9));

        // length of list by .size()
        System.out.println(list.size());
    }
}