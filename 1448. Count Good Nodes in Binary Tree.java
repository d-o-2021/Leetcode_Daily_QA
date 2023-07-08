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
    public void solve(int maxtillnow,int rootval,TreeNode root,int ans[])
    {
        if(root==null)return;
        if(maxtillnow<root.val)maxtillnow=root.val;
        if(rootval<=root.val&&maxtillnow<=root.val)ans[0]++;
        solve(maxtillnow,rootval,root.left,ans);
        solve(maxtillnow,rootval,root.right,ans);
    }
    public int goodNodes(TreeNode root) {
        int ans[]=new int[1];
        solve(root.val,root.val,root,ans);
        return ans[0];
    }
}
