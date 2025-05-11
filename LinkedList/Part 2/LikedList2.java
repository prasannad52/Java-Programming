
class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean existed = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                existed = true;
            }
        }
        if (existed == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            prev = fast;
        }
        prev.next = null;
    }

    public static Node head;

    // slow fast approach
    public static boolean cycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void printing() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(4);
        head.next.next.next = temp;
        removeCycle();
        printing();
    }
}