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
    List<String> paths=new ArrayList<>();
    public void solve(TreeNode root,String ans)
    {
        if(root==null)return;
        ans+=root.val;
        if(root.left==null&&root.right==null)
        {
            paths.add(ans);
            return ;
        }
        ans+="->";
        solve(root.left,ans);
        solve(root.right,ans);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        String ans="";
        solve(root,ans); 
        return paths;
    }
}
