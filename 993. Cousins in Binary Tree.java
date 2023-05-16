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
    TreeNode node;
    int height;
    int parent;
    pair(TreeNode x,int y,int z)
    {
        node=x;
        height=y;
        parent=z;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<pair> q=new LinkedList<>();
        int hx=-1;
        int hy=-1;
        int px=-1;
        int py=-1;
        q.add(new pair(root,0,101));
        while(!q.isEmpty())
        {
            pair pair=q.remove();
            TreeNode node=pair.node;
            int h=pair.height;
            int p=pair.parent;
            if(node.val==x)
            {
                hx=h;
                px=p;
            }
            else if(node.val==y)
            {
                hy=h;
                py=p;
            }
            if(node.left!=null)
            {
                q.add(new pair(node.left,h+1,node.val));
            }
            if(node.right!=null)
            {
                q.add(new pair(node.right,h+1,node.val));
            }
        }
        if(px!=py)
        {
            if(hx==hy)
            {
                return true;
            }
        }
        return false;
        
    }
}
