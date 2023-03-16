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
    public void inorder(TreeNode root,Set<Integer> set)
    {
        if(root==null)return ;
        inorder(root.left,set);
        set.add(root.val);
        inorder(root.right,set);
    }
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set=new LinkedHashSet<>();
        inorder(root,set);
        List<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);
        if(arr.size()>=2)return arr.get(1);
        return -1;
    }
}
