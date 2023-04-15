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
    public boolean solve(TreeNode root)
    {
        if(root.val==1)return true;
        else if(root.val==0)return false;
        boolean left=solve(root.left);
        boolean right=solve(root.right);
        if(root.val==2)return left||right;
        else return left&&right;
    }
    public boolean evaluateTree(TreeNode root) {
        return solve(root);
    }
}
