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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return null;
        TreeNode troot=root;
        TreeNode left=increasingBST(root.left);
        TreeNode right=increasingBST(root.right);
        root.right=right;
        root.left=null;
        TreeNode temp=left;
        if(left!=null)
        {
            while(left.right!=null)
            {
                left=left.right;
            }
            left.right=root;
            return temp;
        }
        else
        {
            return root;
        }
    }
}
