class CircularQueueArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        // constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static boolean isFull() {
            return front == (rear + 1) % size;
        }

        public static void add(int data) {
            if (front == (rear + 1) % size) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = front + 1;// this is for the first element
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = arr[front];
            // for last element deleting
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return data;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}