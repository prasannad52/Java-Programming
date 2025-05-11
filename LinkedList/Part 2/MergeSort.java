//very important (Merge sort)

class MergeSort {
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

    // slow fast approach
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null && head.next == null) {
            return true;
        }
        // step 1: find mid
        Node midNode = findMidNode(head);

        // step 2: reverse second half
        Node prev = null;
        Node cur = midNode;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // step 3: compare first half and second half
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node merge(Node head1, Node head2) {
        Node newList = new Node(-1);
        Node temp = newList;
        while (head1 != null && head2 != null) {
            if (head1.data >= head2.data) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            } else {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        return newList.next;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid node
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // finding mid
        Node mid = findMid(head);// this mid is left list last element
        Node rightHead = mid.next;// here I am dividing the list by right and left linked list
        mid.next = null;
        // devdiding right and left array
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        // merging both linkedlist
        return merge(left, right);
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(3);
        ll.addFirst(1);
        System.out.println("----------------------------------------------------");
        ll.printing();
        ll.head = ll.mergeSort(ll.head);
        ll.printing();
    }
}