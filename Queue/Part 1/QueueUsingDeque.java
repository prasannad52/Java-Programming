import java.util.*;

class QueueUsingDeque {
    static class queue {
        static Deque<Integer> dq = new LinkedList<>();

        public static void add(int data) {
            dq.addFirst(data);
        }

        public static int remove() {
            return dq.removeLast();
        }

        public static int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}