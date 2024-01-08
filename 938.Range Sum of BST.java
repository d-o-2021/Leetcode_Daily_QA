/*
Intuition
Recursion🤝🤝

Approach
let recursion do all for you,
standing on a particular node get left and right node that lies within range and if that particular node too!! than add that node to the ans and return it.all done!

Complexity
Time complexity:
O(n) : n number of nodes

Space complexity:
O(n)
Code
*/
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return 0;
        int left=rangeSumBST(root.left,low,high);
        int right=rangeSumBST(root.right,low,high);
        return left+right+(root.val<=high && root.val>=low?root.val:0);
    }
}
