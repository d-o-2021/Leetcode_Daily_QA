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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            double sum=0;
            int size=q.size();
            double count=q.size();
            while(size!=0)
            {
                TreeNode temp=q.remove();
                sum+=temp.val;
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                size--;
            }
            ans.add((sum/count));
        }
        return ans;
    }
}
