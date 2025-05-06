import java.util.ArrayList;

public class RootToLeafNodeSum {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = right = null;
        }
    }

    static class Solution {
        public ArrayList<Integer> solve(Node root, int target) {
            ArrayList<Integer> path = new ArrayList<>();
            if(findPath(root, target, path)) {
                return path;
            }

            return new ArrayList<>();
        }

        public boolean findPath(Node root, int target, ArrayList<Integer> path) {
            if(root == null) {
                return false;
            }
            path.add(root.data);

            if(root.data == target) {
                return true;
            }

            if(findPath(root.left, target, path) || findPath(root.right, target, path)) {
                return true;
            }

            path.remove(path.size() - 1);  //If target was not found then Backtrack and remove the last element from the path
            return false;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right.left = new Node(1);
        root.right.right = new Node(2);

        
        Solution solution = new Solution();
        ArrayList<Integer> path = solution.solve(root, 7);
        System.out.println(path);
        
    }
    
}
