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
    // public TreeNode search(TreeNode root,int key)
    // {
    //     if(root==null)return null;
    //     if(root.val==key)return root;
    //     else if(root.val>key)return search(root.left,key);
    //     return search(root.right,key);
    // }
    public int findMin(TreeNode root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root.val;
    }
    public TreeNode delete(TreeNode root, int key)
    {
        if(root==null)return root;
        else if(root.val==key)
        {
            if(root.left==null&&root.right==null)
            {
                root=null;
                return root;
            }
            else if(root.left==null&&root.right!=null)
            {
                TreeNode temp=root.right;
                root=null;
                return temp;
            }
            else if(root.left!=null&&root.right==null)
            {
                TreeNode temp=root.left;
                root=null;
                return temp;
            }
            else if(root.left!=null&&root.right!=null)
            {
                int temp=findMin(root.right);
                root.val=temp;
                root.right=delete(root.right,temp);
                return root;
            }
        }
        else if(root.val<key)
        {
            root.right= delete(root.right,key);
            return root;
        }
        else 
        {
            root.left= delete(root.left,key);
            return root;
        }
        return null;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
}
