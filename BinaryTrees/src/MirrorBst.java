public class MirrorBst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    //Create Mirror of a tree
    public static Node createMirror(Node root) {
        if(root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    //preorder 
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        /*
          8
         / \
         5  10
        / \   \
        3  6   11
         */
        /*
         * Mirror of the above tree
                   8
                  / \
                 10  5
                /   / \
                11  6  3
         */

        preorder(root);
        System.out.println();
        root = createMirror(root);
        preorder(root);
    }
    

}
