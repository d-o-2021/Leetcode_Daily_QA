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
    public void solve(TreeNode root,HashMap<Integer,Integer> map,int max[])
    {
        if(root==null)return ;
        solve(root.left,map,max);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        if(max[0]<map.get(root.val))
        {
            max[0]=map.get(root.val);
        }
        solve(root.right,map,max);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max[]=new int[1];
        max[0]=0;
        int k=0;
        solve(root,map,max);
        // int ans[]=new int[max[0]];
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==max[0])
            {
                    arr.add(e.getKey());  
            }
        }
        // System.out.println(map);
        // System.out.println(arr);return null;
        int ans[]=new int[arr.size()];
        for(int i:arr)
        {
            ans[k++]=i;
        }
        return ans;

    }
}
