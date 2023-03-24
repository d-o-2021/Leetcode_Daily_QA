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
class pair
{
    int height;
    boolean isBal;
    pair(int height,boolean isBal)
    {
        this.height=height;
        this.isBal=isBal;
    }
} 
class Solution {
    public pair solve(TreeNode root)
    {
        if(root==null)
        {
            return new pair(0,true);
        }
        pair left=solve(root.left);
        pair right=solve(root.right);
        pair curr=new pair(0,false);
        if(Math.abs(left.height-right.height)<=1)
        {
            if(left.isBal&&right.isBal)
            {
                curr=new pair(Math.max(left.height,right.height)+1,true);
            }
        }
        return curr;
    }
    public boolean isBalanced(TreeNode root) {
        return solve(root).isBal;
        
    }
}
