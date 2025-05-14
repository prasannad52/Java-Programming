class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop operation
        public static int pop() {
            if (head == null) {
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public static int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(5);
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}