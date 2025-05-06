package BinaryTrees.src;

import java.util.ArrayList;

public class BuildBst {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildTree(Node root, int val) {  // yha root khud parent hoti haa so left right null he rhega or value add hoti rhegi
        if (root == null) {               // Root null hoga jab jab value add ho jyegi root mai
            root = new Node(val);
            return root;
        }
        if (root.data > val ) {
            // Left Subtree
            root.left = buildTree(root.left, val);      // root.left or root.right yeah parent ke liye hota haa 
        }
        else {
            // Right Subtree
            root.right = buildTree(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Searching in a BST

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if (root.data == key) {
            return true;            
        }
        if (root.data > key) {           // Agar root ka data key se bada hai to left mai jao
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }
    // Delete the Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data > val) {
            root.left = delete(root.left, val);  // jab dono condition false hogi mtlb root.data == val hoga toh else block chlega jo delete krega
        }
        else {  //  else block us node ke liye execute ho raha hai jo delete karni hai  
            //case 1 - leaf node
            if(root.left == null && root.right == null) {           // Delete node and return NULL to parent
                return null;
            }
            // case 2 - single child
            if(root.left == null) {             // Replace the node with the child
                return root.right;
            }else if(root.right == null) {
                return root.left;
            }
            //case 3 - Both Children
            Node IS = findInorderSuccessor(root.right);   // Inorder successor (IS) right subtree ka sabse chhota element hota hai.
            // Matlab, delete hone wali node ke data ko successor ke data se replace kar do.
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) { // Inorder Successor is the leftmost node of the right subtree
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    //print the tree in range
    public static void printInRange(Node root, int k1, int k2) {

        if(root == null) {
            return;
        }
        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1) {   // Agar root ka data k1 se chhota hai toh right mai jao
            printInRange(root.right, k1, k2);
        }
        else {  // Agar root ka data k2 se bada hai toh left mai jao
            printInRange(root.left, k1, k2);
        }
       
    }

    // Print the sum of tree in ranges 
    public static int printInRangeSum(Node root, int k1, int k2) {
        if (root == null) {
            return 0;
        }
        
        int sum = 0; // Har call ke liye new sum
        
        if (root.data >= k1 && root.data <= k2) {
            sum += printInRangeSum(root.left, k1, k2); // Left se sum le lo
            sum += root.data; // Apna data add karo
            sum += printInRangeSum(root.right, k1, k2); // Right se sum le lo
        } 
        else if (root.data < k1) { // Agar root ka data chhota hai toh sirf right
            sum += printInRangeSum(root.right, k1, k2);
        } 
        else { // Agar root ka data bada hai toh sirf left
            sum += printInRangeSum(root.left, k1, k2);
        }
        
        return sum;
    }
    
    
    // Root to leaf path
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    // printpath
    public static void printPath(ArrayList<Integer> path) {
        for(int i =0; i<path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    // Check Valid BST, Max value in left subtree should be less than root and min value in right subtree should be greater than root
    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {   //  left mai jo minimum value hoga wo root sey agr bda haa toh false return karega 
            return false;
        }
        else if(max != null && root.data >= max.data) {
            return false;  // right mai jo maximum value hoga wo root sey chota hoga toh false return karega
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
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
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i =0; i<values.length; i++) {
            root = buildTree(root, values[i]);
        }

        // inorder(root);
        // System.out.println();
        // root = createMirror(root);
        // preorder(root);


        // if(isValidBST(root, null, null)) {
        //     System.out.println("Valid BST");
        // }
        // else {
        //     System.out.println("Not a Valid BST");
        // }

        printRoot2Leaf(root, new ArrayList<>());

        // if(search(root, 7)) {
        //     System.out.println("Found");
        // }else {
        //     System.out.println("Not Found");
        // }

    //    printInRange(root, 5, 13);
    //    System.out.println();
    //    int ans =  printInRangeSum(root, 5, 13);
    //    System.out.println("Sum of Tree: "+ans);
       
       

        // delete(root, 2);

        // System.out.println("After Deletion");

        // inorder(root);

       
    } 
}
