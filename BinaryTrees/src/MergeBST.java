import java.util.ArrayList;

public class MergeBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public static Node mergeBST(Node root1, Node root2) {

        // Step 1: Traverse the first BST and store the elements in an array
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);

        // Step 2: Traverse the second BST and store the elements in an array
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);

        // merge the two arrays
        ArrayList<Integer> mergedArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                mergedArr.add(arr1.get(i));
                i++;
            } else {
                mergedArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            mergedArr.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            mergedArr.add(arr2.get(j));
            j++;
        }

        // Step 3 Sorted AL -> Balanced BST
        return createBST(mergedArr, 0, mergedArr.size() - 1);  // yha pr createBST call hoga or root return hoga vo root preorder sey call hoga or ek balanced merged BST milega

    }

    public static Node createBST(ArrayList<Integer> mergedArr, int start, int end) {

        if (start > end) {
            return null;

        }
        int mid = (start + end) / 2;
        Node root = new Node(mergedArr.get(mid));
        root.left = createBST(mergedArr, start, mid - 1);
        root.right = createBST(mergedArr, mid + 1, end);
        return root;    // Yha pr root return hokr createBSt me ayega 
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node bst1 = new Node(2);
        bst1.left = new Node(1);
        bst1.right = new Node(4);

        Node bst2 = new Node(9);
        bst2.left = new Node(3);
        bst2.right = new Node(12);

        Node root = mergeBST(bst1, bst2);
        preorder(root);
    
    }

}
