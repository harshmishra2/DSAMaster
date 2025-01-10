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
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root.left, root.right);
        
    }
    private boolean isMirror(TreeNode rn, TreeNode ln){
        if(rn==null && ln==null){
            return true;
        }
        if(rn == null || ln == null){
            return false;
        }

        return rn.val==ln.val && isMirror(rn.right, ln.left) && isMirror(ln.right, rn.left);
    }
}

//https://leetcode.com/problems/symmetric-tree/?envType=study-plan-v2&envId=top-interview-150