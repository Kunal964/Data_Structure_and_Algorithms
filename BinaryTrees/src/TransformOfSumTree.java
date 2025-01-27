public class TransformOfSumTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int Transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftChild = Transform(root.left);
        int rightChild = Transform(root.right);
        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data =  newLeft + leftChild + newRight + rightChild;
        return data;

    }
    public static  void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
                       1
                     /   \
                    2     3
                   / \   /  \
                  4   5 6    7

         */
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        newNode.right.left = new Node(6);
        newNode.right.right = new Node(7);

        Transform(newNode);
        preorder(newNode);

        /*
        Expected Output

                       27
                     /   \
                    9     13
                   / \   /  \
                  0   0 0    0
         */


    }
}
