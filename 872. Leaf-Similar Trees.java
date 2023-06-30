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
    String temp="";
    public void solve(TreeNode root)
    {
        if(root==null)return ;
        solve(root.left);
        if(root.left==null&&root.right==null)
        {
            temp+=root.val+',';
            return;
        }
        solve(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String r1="";
        solve(root1);
        r1=temp;
        temp="";
        String r2="";
        solve(root2);
        r2=temp;
        System.out.println(r1);
        System.out.println(r2);
        return r1.equals(r2);
    }
}
