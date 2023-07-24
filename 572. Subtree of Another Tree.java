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
    public void solve(TreeNode root, TreeNode subRoot,ArrayList<TreeNode> nodes)
    {
        if(root==null)return ;
        if(subRoot!=null&&root.val==subRoot.val){
            nodes.add(root);
        }
        solve(root.left,subRoot,nodes);
        solve(root.right,subRoot,nodes);
    }
    public boolean checkTree(TreeNode root, TreeNode subRoot)
    {
        if(root==null&&subRoot==null)return true;
        if(root!=null&&subRoot!=null&&root.val==subRoot.val)
        {
            return checkTree(root.left,subRoot.left)&&checkTree(root.right,subRoot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==root)return true;
        else
        {
            ArrayList<TreeNode> nodes=new ArrayList<>();
            solve(root,subRoot,nodes);
            boolean flag=false;
            for(TreeNode node:nodes)
            {
                flag=checkTree(node,subRoot);
                if(flag)return flag;
            }
            return flag;
        }
    }
}
