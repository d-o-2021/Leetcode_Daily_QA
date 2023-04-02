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
    int index;
    public int findPos(int []inorder,int data,int n)
    {
        for(int i=0;i<n;i++)if(data==inorder[i])return i;
        return -1;
    }
    public TreeNode solve(int[] inorder, int[] postorder,int st,int ed,int n)
    {
        if(index<0||st>ed)return null;
        int data=postorder[index--];
        TreeNode head=new TreeNode(data);
        int pos=findPos(inorder,data,n);
        head.right=solve(inorder,postorder,pos+1,ed,n);
        head.left=solve(inorder,postorder,st,pos-1,n);
        return head;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        int st=0,ed=index,n=index+1;
        return solve(inorder,postorder,st,ed,n);
    }
}
