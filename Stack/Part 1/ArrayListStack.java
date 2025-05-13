import java.util.ArrayList;

class ArrayListStack {
    static class stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            int data = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return data;
        }

        public int peek() {
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}