class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int count[]=new int[n];
        int matrix[][]=new int[n][n];
        for(int road[]:roads)
        {
            count[road[0]]++;
            count[road[1]]++;
            matrix[road[0]][road[1]]=1;
            matrix[road[1]][road[0]]=1;
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                ans=Math.max(ans,count[i]+count[j]-matrix[i][j]);
            }
        }
        return ans;
    }
}
