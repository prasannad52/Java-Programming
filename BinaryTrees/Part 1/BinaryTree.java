import java.util.*;

class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryT {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + "  ");
                return;
            }
            System.out.print(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + "  ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + "  ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + "  ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "  ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println("");
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryT tree = new BinaryT();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("---------------");
        tree.preOrder(root);
        System.out.println("");
        System.out.println("---------------");
        tree.inOrder(root);
        System.out.println("");
        System.out.println("---------------");
        tree.postOrder(root);
        System.out.println("");
        System.out.println("---------------");
        tree.levelOrder(root);
    }
}