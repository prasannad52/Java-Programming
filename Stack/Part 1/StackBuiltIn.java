import java.util.*;

class StackBuiltIn {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}