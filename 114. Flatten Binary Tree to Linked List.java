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
    public TreeNode solve(TreeNode root)
    {
        if(root==null)return null;
        TreeNode head=root;
        TreeNode left=solve(root.left);
        TreeNode right=solve(root.right);
        head.left=null;
        head.right=left;
        if(left!=null)
        {
            while(left.right!=null)left=left.right;
            left.right=right;
        }
        else head.right=right;
        return head;
    }
    public void flatten(TreeNode root) {
        root=solve(root);
    }
}
