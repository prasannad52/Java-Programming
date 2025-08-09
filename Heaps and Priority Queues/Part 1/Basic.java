import java.util.*;

public class Basic {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(10);
        pq.add(20);
        pq.add(90);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}