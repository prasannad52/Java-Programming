import java.util.*;

public class MultidimensionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> curList = list.get(i);
            for (int j = 0; j < curList.size(); j++) {
                System.out.print(curList.get(j) + " ");
            }
            System.out.println("");
        }
    }
}