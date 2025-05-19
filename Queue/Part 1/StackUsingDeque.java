import java.util.*;

class StackUsingDeque {
    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        public static void push(int data) {
            dq.addLast(data);
        }

        public static int pop() {
            return dq.removeLast();
        }

        public static int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(0);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}