
class SubtreeOfAnotherTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int LeftDiam = diameter(root.left);
            int LeftHt = height(root.left);
            int RightDiam = diameter(root.right);
            int RightHt = height(root.right);

            int selfdiam = LeftDiam + RightDiam + 1;
            return Math.max(selfdiam, Math.max(LeftHt, RightHt));
        }
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(leftInfo.diam, Math.max(rightInfo.diam, leftInfo.ht + rightInfo.ht + 1));

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static boolean isIdenticle(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if (!isIdenticle(node.left, subroot.left)) {
            return false;
        }
        if (!isIdenticle(node.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdenticle(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(5);
        Node subroot = new Node(3);
        // subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));
    }
}