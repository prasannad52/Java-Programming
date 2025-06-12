
import java.util.ArrayList;

public class Root2Leaf {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void printroot2Leaf(ArrayList<Integer> path) {
        System.out.println("");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "-->");
        }
        System.out.print("null");
    }

    public static void root2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printroot2Leaf(path);
        }
        root2Leaf(root.left, path);
        root2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        root2Leaf(root, new ArrayList<>());
    }
}