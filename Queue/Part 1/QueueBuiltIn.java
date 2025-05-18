import java.util.*;

class QueueBuiltIn {
    public static void main(String[] args) {
        // Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>();// LL is an interface important
        // analyze the difference between Linkedlist and Arraydeque
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}