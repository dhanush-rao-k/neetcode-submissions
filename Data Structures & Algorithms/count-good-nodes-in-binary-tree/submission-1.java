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
    int res=0;
    public int goodNodes(TreeNode root) {
        dfs(root,root.val);
        return res;
    }
    public int dfs(TreeNode node,int big)
    {   
        if(node==null)
            return 0;
        if(node.val>=big)
        {
            res++;
            big=Math.max(big,node.val);
        }
        dfs(node.left,big);
        dfs(node.right,big);
        return res;
        
    }
}
