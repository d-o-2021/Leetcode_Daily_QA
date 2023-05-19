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
    public void solve(TreeNode root)
    {
        if(root==null)return ;
        ans+=root.val;
        if(root.left!=null)
        {
            ans+='(';
            solve(root.left);
            ans+=')';
        }
        if(root.right!=null)
        {
            if(root.left==null)
            {
                ans+="()";
            }
            ans+='(';
            solve(root.right);
            ans+=')';
        }        
    }
        String ans="";
    public String tree2str(TreeNode root) {
        solve(root);
        return ans;
    }
}
