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
    public void solve(TreeNode root,List<Integer> in)
    {
        if(root==null)return ;
        solve(root.left,in);
        in.add(root.val);
        solve(root.right,in);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        solve(root,in);
        return in;
    }
}
