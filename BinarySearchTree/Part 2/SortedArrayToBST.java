
public class SortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node sortedToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = sortedToBST(arr, start, mid - 1);
        root.right = sortedToBST(arr, mid + 1, end);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int val[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = sortedToBST(val, 0, val.length - 1);
        preorder(root);
    }
}