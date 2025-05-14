import java.util.*;

class PushToBottom {
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushBottom(st, 4);

        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}