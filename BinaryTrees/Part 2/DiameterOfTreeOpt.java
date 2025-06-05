
class DiameterOfTreeOpt {
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

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(5);
        System.out.println(root.diameter(root));
        System.out.println(diameter(root).diam);
    }
}