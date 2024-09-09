public class Classroom {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
   public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return  leftCount + rightCount + 1;
   }

   public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;

        /*
           When you call sum(4), Node 4 is a leaf node. Here's how the function works for Node 4:
           sum(4):
           - Node 4 is not null, so we proceed.
           - leftSum = sum(4.left) → sum(null) = 0 (since 4 is a leaf node, it has no left child)
           - rightSum = sum(4.right) → sum(null) = 0 (since 4 is a leaf node, it has no right child)
            - return leftSum + rightSum + root.data → return 0 + 0 + 4 = 4

         So, sum(4) returns 4, which is the value of the node itself.

         sum(5) Calculation:
     Similarly, when you call sum(5), Node 5 is also a leaf node. Here's how the function works for Node 5:
     - Node 5 is not null, so we proceed.
     - leftSum = sum(5.left) → sum(null) = 0 (since 5 is a leaf node, it has no left child)
      - rightSum = sum(5.right) → sum(null) = 0 (since 5 is a leaf node, it has no right child)
      - return leftSum + rightSum + root.data → return 0 + 0 + 5 = 5
       So, sum(5) returns 5, which is the value of the node itself.
        */
   }

   public static int diameter(Node root) {
    if (root == null) {
        return 0;
    }
    int leftdiam = diameter(root.left);
    int leftHt = height(root.left);
    int rightdiam = diameter(root.right);
    int rightHt = height(root.right);

    int selfdiam = leftHt + rightHt +1;

    return Math.max(selfdiam , Math.max(leftdiam, rightdiam));

   }

   static class Info {
    int diam;
    int ht;

    public Info(int diam, int ht) {
        this.diam = diam;
        this.ht = ht;
    }
}

public static Info diameter2(Node root) {
    if (root == null) {
        return new Info(0, 0);
        
    }
    Info leftInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
    int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
    return new Info(diam, ht);
}

// Check Subroot exists in Root

public static boolean isIdentical(Node node, Node subRoot) {
    if (node == null && subRoot == null) {
        return true;   
    }
    else if(node == null || subRoot == null || node.data != subRoot.data) {
        return false;
    }

    if (!isIdentical(node.left, subRoot.left)) 
    {
        return false;
        
    }
    if (!isIdentical(node.right, subRoot.right)) {
        return false;
        
    }
    return true;
}
public static boolean isSubTree(Node root, Node subRoot) {
    if (root == null) {
        return false;  
    }
    if (root.data == subRoot.data) {
        if (isIdentical(root, subRoot)) {
            return true;      
        }  
    }
    return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
}










    public static void main(String[] args) {
        /*
                           1
                         /   \
                        2     3
                       / \   / \
                      4   5 6   7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);

        /*
                       2
                      / \
                     4   5
         */

         Node subRoot = new Node(2);
         subRoot.left = new Node(4);
         subRoot.right = new Node(5);

         System.out.println(isSubTree(root, subRoot));


    }
}
