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

class Solution {
    public boolean isValidBST(TreeNode root) {
        return Valid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean Valid(TreeNode node,int min, int max)
    {
        if(node==null)
            return true;
        if(!(node.val<max && node.val>min))
            return false;
        return Valid(node.left,min,node.val) && Valid(node.right,node.val,max);
    }
}
