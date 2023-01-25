class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        for(int a[]:grid)
        {
            Arrays.sort(a);
        }
        int max=0;
        for(int index=grid[0].length-1;index>=0;index--)
        {
            for(int i[]:grid)
            {
                if(max<i[index])
                max=i[index];
            }
            ans+=max;
            max=0;
        }
        return ans;
    }
}
