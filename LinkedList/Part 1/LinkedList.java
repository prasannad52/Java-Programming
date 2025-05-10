
class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // creating a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // new node next is pointing to the head
        newNode.next = head;
        // updating head
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printing() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int dltFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (key == temp.data) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }

    public void reverseList() {
        Node prev = null;
        Node cur = tail = head;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void dltNthfromEnd(int n) {
        int sz = 0;
        Node cur = head;
        while (cur != null) {
            cur = cur.next;
            sz++;
        }
        if (sz == n) {
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        while (i < sz - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(3);
        System.out.println("----------------------------------------------------");
        list.printing();
        // System.out.println("----------------------------------------------------");
        // list.add(1, 5);
        // list.printing();
        // System.out.println("----------------------------------------------------");
        // System.out.println(list.size);
        // System.out.println("----------------------------------------------------");
        // System.out.println(list.dltFirst());
        // System.out.println("----------------------------------------------------");
        // System.out.println(list.removeLast());
        // System.out.println("----------------------------------------------------");
        // list.printing();
        // System.out.println("----------------------------------------------------");
        // System.out.println(list.search(5));
        // System.out.println("----------------------------------------------------");
        list.reverseList();
        System.out.println("----------------------------------------------------");
        list.printing();
        System.out.println("----------------------------------------------------");
        list.dltNthfromEnd(1);
        System.out.println("----------------------------------------------------");
        list.printing();
    }
}