import java.util.*;

class DequeDataStructure {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addLast(3);
        d.removeFirst();
        d.removeLast();
        d.addLast(4);
        d.getFirst();
        System.out.println(d);
        System.out.println(d.remove());
    }
}