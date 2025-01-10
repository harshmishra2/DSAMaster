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
class SameTrees {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }
        if(q==null || p==null){
            return false;
        }

        return (p.val==q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }
}
//https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150
