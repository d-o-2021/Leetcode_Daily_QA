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
 2 3 4 5 6 7
 */
class Solution {
    public void inorder(TreeNode root,List<Integer> in)
    {
        if(root==null)return ;
        inorder(root.left,in);
        in.add(root.val);
        inorder(root.right,in);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> in=new ArrayList<>();
        inorder(root,in);
        int i=0,j=in.size()-1;
        while(i<j)
        {
            int sum=in.get(i)+in.get(j);
            if(sum==k)return true;
            else if(sum>k)j--;
            else i++;
        }
        return false;
        
    }
}
