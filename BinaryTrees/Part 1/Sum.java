
class Sum {
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

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            int totalSum = ls + rs + root.data;
            return totalSum;
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryT tree = new BinaryT();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(tree.sum(root));
    }
}