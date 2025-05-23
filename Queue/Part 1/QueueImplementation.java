class QueueImplementation {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        // here front is always first index of the array thats why I don't write
        // this is the implementation of the queue using array

        // constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // checking queue is empty or not
        public static boolean isEmpty() {
            return rear == -1;
        }

        // adding an element to the queue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove an element from the queue
        public static int remove() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // peek function
        public static int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}