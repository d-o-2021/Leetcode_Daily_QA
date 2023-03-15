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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        solve(root,in);
        return in;
    }
    public void solve(TreeNode root,List<Integer> in)
    {
        if(root==null)return ;
        in.add(root.val);
        solve(root.left,in);
        solve(root.right,in);
    }
}
