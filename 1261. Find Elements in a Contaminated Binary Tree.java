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
class FindElements {
    int target;
    boolean flag=false;
    TreeNode root;
    public FindElements(TreeNode root) {
        if(root!=null)
        root.val=0;
        this.root=root;
    }
    
    public boolean find(int target) {
        this.flag=false;
        if(target!=0)
        this.target=target;
        else 
        {
            flag=true;
        }
        updateTree(root);
        return flag;
    }
    public void updateTree(TreeNode root)
    {
        if(root==null){
            return ;
        }
        if(root.left!=null)
        {
            root.left.val=2*root.val+1;
            if(root.left.val==target)flag=true;
        }
        if(root.right!=null)
        {
            root.right.val=2*root.val+2;
            if(root.right.val==target)flag=true;
        }
        updateTree(root.left);
        updateTree(root.right);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
