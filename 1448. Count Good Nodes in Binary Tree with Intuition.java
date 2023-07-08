# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Something.. we need to do with each path from root since we need to visit each node.

# Approach
<!-- Describe your approach to solving the problem. -->
Traversing through each path and updating two variables maxtillnow(for each path) and the root node value(rootval : fixed always).
So, using preorder traversal visit each node and check if this current node(let X) is greater than 'maxtillnow' and with root node value 'rootval' as well,if so we need to update maxtillnow for future (since it may come in further paths) and as per que : if in path from root node to node X there exists no such node with value greater than value of node X then node X is a good node.
so if this above condition satisfied than we simply add one to our answer.

# Complexity
- Time complexity:
visiting each node using preorder therefore : O(n) ; 
n : number of nodes.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
O(h) ; 
h : maximum height of tree
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
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
    public void solve(int maxtillnow,int rootval,TreeNode root,int ans[])
    {
        if(root==null)return;
        if(maxtillnow<root.val)maxtillnow=root.val;
        if(rootval<=root.val&&maxtillnow<=root.val)ans[0]++;
        solve(maxtillnow,rootval,root.left,ans);
        solve(maxtillnow,rootval,root.right,ans);
    }
    public int goodNodes(TreeNode root) {
        int ans[]=new int[1];
        solve(root.val,root.val,root,ans);
        return ans[0];
    }
}
```
