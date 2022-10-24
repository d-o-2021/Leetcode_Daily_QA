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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans=0;
        if(root==null)return 0;
        if(root.val>=low&&root.val<=high)
        {
            ans+=root.val;
        }
        int left=rangeSumBST(root.left,low,high);
        int right=rangeSumBST(root.right,low,high);
        return left+right+ans;
        
    }
}
