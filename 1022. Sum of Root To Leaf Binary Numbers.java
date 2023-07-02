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
    public void solve(TreeNode root,String curr,List<String> list)
    {
        if(root==null)return;
        curr+=root.val;
        solve(root.left,curr,list);
        if(root.left==null&&root.right==null)
        {
            list.add(curr);
        }
        solve(root.right,curr,list);
        curr=curr.substring(0,curr.length()-1);

    }
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> num=new ArrayList<>();
        solve(root,"",num);
        int ans=0;
        for(String s:num)
        {
            int pow=0;
            int decimal=0;
            for(int i=s.length()-1;i>=0;i--)
            {
                decimal+=(s.charAt(i)-'0')*Math.pow(2,pow++);
            }
            ans+=decimal;
        }
        // System.out.println(num);
        return ans;

        
    }
}
