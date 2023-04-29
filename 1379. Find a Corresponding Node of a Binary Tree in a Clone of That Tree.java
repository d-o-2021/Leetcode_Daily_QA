/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public void solve(TreeNode cloned,TreeNode target)
    {
        if(cloned==null)return;
        if(cloned.val==target.val)ans=cloned;
        solve(cloned.left,target);
        solve(cloned.right,target);
    }
    TreeNode ans=null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        solve(cloned,target);
        return ans;
    }
}
