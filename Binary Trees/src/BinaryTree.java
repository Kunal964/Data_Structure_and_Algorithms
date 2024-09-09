import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

    static class BinaryTreeB {
        static int indx = -1;

        public static Node buildTree(int[] nodes) {
            indx++;
            // Check if index is within the bounds of the array
            if (indx >= nodes.length || nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void Preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data+ " ");
            Preorder(root.left);
            Preorder(root.right);
            // root , left subtree, right subtree

        }
        public static  void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
            //left subtree, root, right subtree
        }
        public  static  void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
            // Left subtree, right subtree, root
        }
        // Level Order Traversal
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data+ " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
    }


    }




    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//                        1
//                       / \
//                      2   3
//                     / \   \
//                    4   5   6

        Node root = BinaryTreeB.buildTree(nodes);
        assert root != null;
//        System.out.println(root.data);
//        BinaryTreeB.Preorder(root);
//        System.out.println();
//        BinaryTreeB.inorder(root);
//        System.out.println();
//        BinaryTreeB.postorder(root);
//        System.out.println();
        BinaryTreeB.levelOrder(root);

    }
}
