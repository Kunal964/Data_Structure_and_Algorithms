public class SIzeofLargestBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class Info {
        int size;
        int min;
        int max;
        boolean isBST;

        public Info(int size, int min, int max, boolean isBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }
    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true); 
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(size, 0, 0, false);
        }
        if(leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(size, min, max, true);
        }
        return new Info(size, min, max, false);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largestBST(root);
        System.out.println("Largest BST Size: " + maxBST);
    }


}
