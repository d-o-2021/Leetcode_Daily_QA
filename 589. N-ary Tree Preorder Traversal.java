/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void solve(Node root,List<Integer> ans)
    {
        if(root==null)return;
        ans.add(root.val);
        for(Node n:root.children)
        {
            solve(n,ans);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        solve(root,ans);
        return ans;
    }
}
