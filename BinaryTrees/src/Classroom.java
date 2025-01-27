import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
    return isIdentical(node.right, subRoot.right);
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

static class View {
        Node node;
        int hd;

        public View(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
}
public static void topView(Node root) {
        //Level Order
    Queue<View> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();

    int min =0, max =0;
    q.add(new View(root, 0));
    q.add(null);

    while(!q.isEmpty()) {
        View curr = q.remove();
        if(curr == null) {
            if(q.isEmpty()) {
                break;
            }
            else {
                q.add(null);
            }
        }else {
            if(!map.containsKey(curr.hd)); {
                // the first time my hd(horizontal distance) is occuring
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left != null) {
                q.add(new View(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if(curr.node.right != null) {
                q.add(new View(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }

        }

    }
    for (int i =min; i<=max; i++) {
        System.out.print(map.get(i).data+ " ");
    }
    System.out.println();
}

// Kth Level of a Tree
public static void KLevel(Node root, int level, int k) {
        if(root == null) {
            return;
        }
        if(level == k) {
            System.out.print(root.data+ " ");
            return;
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
}
// Lowest Common Ancestor
    public static Node lca(Node root, int n1,int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //Lowest Common ancestor
        int i =0;
        for(; i<path1.size() && i<path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    //Lowest  Common Ancestor Approach 2
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        // LeftLCa = val, rightLca = null
        if(rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
            
        }
        return root;
    }


    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }
        path.add(root);
        if(root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    //Minimum Distance Between Nodes
    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        
        if(leftDist == -1 && rightDist == -1) {
            return -1;
        }
        else if(leftDist == -1) {
            return rightDist+1;
        } else {
            return leftDist+1;
        }
    }
    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1); // N1 sey LCA tak ka distance 
        int dist2 = lcaDist(root, n2);
        
        return dist1 + dist2;
    }
    // Kth Ancestor of a Node
    public static int KAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max+1 == k) {
            System.out.println(k+"th Ancestor of a Node "+ n+ ": " +root.data);
        }
        return max+1;
    }

    //Transform a Tree to Sum Tree
    public static int transform(Node root) {
        if(root == null) {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        System.out.println("Node " + data + " transformed to " + root.data);
        return data;
    }

    public static void preorder(Node root) {
        if(root == null) {
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

        transform(root);
        preorder(root);
//        System.out.println(height(root));
//        System.out.println(count(root));
//        System.out.println(sum(root));
//        System.out.println(diameter(root));
//        System.out.println(diameter2(root).diam);

        /*
                       2
                      / \
                     4   5
         */

//          Node subRoot = new Node(2);
//          subRoot.left = new Node(4);
//          subRoot.right = new Node(5);

// //         System.out.println(isSubTree(root, subRoot));
//          topView(root);
//          int k = 3;
// //         KLevel(root,1,k);
//          int n1 = 4, n2 = 6;
//         // System.out.println(lca(root, n1, n2).data);
//         // System.out.println("Lowest Common Ancestor Between Nodes: "+ n1 + " to "+ n2 + ": " + lca2(root, n1, n2).data);
//         // System.out.println("Minimum Distance Between Nodes: "+ n1 + " to "+ n2 + ": " + minDist(root, n1, n2));


//         int n = 5, k1 = 2;
//         KAncestor(root, n, k1);
    }
}
