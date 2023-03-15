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
    public void inorder(TreeNode root,List<TreeNode> in)
    {
        if(root==null)return;
        inorder(root.left,in);
        in.add(root);
        inorder(root.right,in);
    }
    public int minDiffInBST(TreeNode root) {
        List<TreeNode> in=new ArrayList<>();
        inorder(root,in);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<in.size()-1;i++)
        {
            int diff=Math.abs(in.get(i).val-in.get(i+1).val);
            if(diff<min)min=diff;
        }
        return min;
    }
}
