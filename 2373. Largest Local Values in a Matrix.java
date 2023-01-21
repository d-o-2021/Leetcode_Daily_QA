class Solution {
    public int findMax(int [][]grid,int st,int ed)
    {
        int max=0;
        for(int i=st;i<st+3;i++)
        {
            for(int j=ed;j<ed+3;j++)
            {
                if(max<grid[i][j])max=grid[i][j];
            }
        }
        return max;
    } 
    public int[][] largestLocal(int[][] grid) {
        int size=grid.length-2;
        int ans[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int max=findMax(grid,i,j);
                ans[i][j]=max;
            }
        }
        return ans;
    }
}
