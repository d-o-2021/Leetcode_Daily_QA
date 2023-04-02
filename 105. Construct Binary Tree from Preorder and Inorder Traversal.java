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
    int index=0;
    public int findPos(int []inorder,int data,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(inorder[i]==data)return i;
        }
        return -1;
    }
    public TreeNode solve(int[] preorder, int[] inorder,int st,int ed,int n)
    {
        if(index>=n||st>ed)return null;
        int data=preorder[index++];
        TreeNode head=new TreeNode(data);
        int pos=findPos(inorder,data,n);
        head.left=solve(preorder,inorder,st,pos-1,n);
        head.right=solve(preorder,inorder,pos+1,ed,n);
        return head;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        int st=0,ed=n-1;
        return solve(preorder,inorder,st,ed,n);
    }
}
