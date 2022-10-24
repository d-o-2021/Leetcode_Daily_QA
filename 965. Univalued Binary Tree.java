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
        int value=-1;
    public boolean isUnivalTree(TreeNode root) {
        if(root!=null)
        if(value<0)value=root.val;
        if(root==null)return true;
        return root.val==value&&isUnivalTree(root.left)&&isUnivalTree(root.right);
        
    }
}
