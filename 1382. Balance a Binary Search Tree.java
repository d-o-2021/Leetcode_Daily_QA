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
    public void solve(TreeNode root,List<Integer> in)
    {
        if(root==null)return ;
        solve(root.left,in);
        in.add(root.val);
        solve(root.right,in);
    }
    public TreeNode generateBST(List<Integer> in,int st,int ed)
    {
        if(st>ed)return null;
        int mid=(st+ed)/2;
        TreeNode root=new TreeNode(in.get(mid));
        root.left=generateBST(in,st,mid-1);
        root.right=generateBST(in,mid+1,ed);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        solve(root,in);
        return generateBST(in,0,in.size()-1);
    }
}
