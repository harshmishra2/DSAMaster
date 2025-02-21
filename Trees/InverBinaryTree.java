/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return root;
        }

        TreeNode temp= root.left;
        root.left = root.right;
        root.right = temp;

        root.left = invertTree( root.left);
        root.right = invertTree( root.right);

        return root;
        
    }
}

//https://leetcode.com/problems/invert-binary-tree/?envType=study-plan-v2&envId=top-interview-150